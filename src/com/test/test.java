package com.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.jdbc.MySQLJDBCDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.model.JDBCDataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dao.CommentDao;
import com.dao.RateDao;
import com.dao.UserDao;
import com.entity.Comment;
import com.entity.Favor;
import com.entity.Scene;
import com.entity.User;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.util.JDBCUtil;
import com.util.StringUtils;



@Component
@Repository
public class test {
	@Autowired
	private static SessionFactory sessionFactory;
	
	UserDao userDao = new UserDao();
	
	public static void main(String[] args) {
		MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName("localhost");
        dataSource.setUser("root");
        dataSource.setPassword("");
        dataSource.setDatabaseName("bishe_db");
		JDBCDataModel dataModel = new MySQLJDBCDataModel(dataSource, "rate", "user_id", "scene_id", "rate","rate_time");
		DataModel model = dataModel;
		try {
			UserSimilarity similarity = new PearsonCorrelationSimilarity(dataModel);
			UserNeighborhood neighborhood = new NearestNUserNeighborhood(2,similarity,model);
			Recommender recommender = new GenericUserBasedRecommender(model,neighborhood,similarity);
			Connection con = JDBCUtil.getConn();
	        Statement stmt = (Statement) con.createStatement();
			 for(int i=0; i<5; i++) {
		            List<RecommendedItem> recommendations = recommender.recommend(i, 3);
		            
		            String tableName = "user_" + i;
		            
		            for (RecommendedItem recommendation : recommendations) {
		                
		                //如果是第一次推荐就创建该用户的数据表
		                if(!JDBCUtil.doesTableExist(tableName)) {
		                    
		                    String createSQL = "create table " + tableName
		                            + " (item_id bigint primary key,value float);";
		                    stmt.execute(createSQL);
		                }
		                
		                String insertSQL = "insert into " + tableName + " values ("
		                        + recommendation.getItemID() + "," + recommendation.getValue() + " );";
		                
		                //插入用户的推荐数据
		                stmt.execute(insertSQL);
		                System.out.println(recommendation);
		            }
			 }
		} catch (TasteException | SQLException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 获取用户喜爱列表
	 * @return
	 */
	public List<Favor> searchUserLikeScene(){
		String sql = "select * from rate where rate > 5";
		List<Map<String,Object>> likeMapList = JDBCUtil.executeQuery(sql);
		List<Favor> favorList = new ArrayList<>();
		if (!likeMapList.isEmpty()) {
			likeMapList.forEach(t->{
				Favor favor = new Favor();
				if (null != t.get("user_id")) {
					favor.setUserId((int) t.get("user_id"));
				}
				if (null != t.get("scene_id")) {
					favor.setSceneId((int) t.get("scene_id"));
				}
				favorList.add(favor);
			});
		}
		return favorList;
	}
	

}
