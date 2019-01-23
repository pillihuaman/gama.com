package repository.System.DataAccess.MySql;
import domain.System.BusinessEntity.Base.Clothing;
import domain.System.BusinessEntity.ViewStockBE;
import infrastructure.System.Adapters.MySqlAdapter;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class stockClothesDA {
	
	   public static   List<ViewStockBE>  getViewStock( ViewStockBE objs)
				throws SQLException, IOException {

			Connection dbConnection = null;
			CallableStatement callableStatement = null;
			ResultSet rs = null;
	            List<ViewStockBE> lst =new ArrayList<ViewStockBE>();
			String getDBUSERCursorSql = "{CALL SelectMenuParent()}";

			try {
				dbConnection = MySqlAdapter.connectDatabase();
				callableStatement = dbConnection.prepareCall(getDBUSERCursorSql);
				//callableStatement.registerOutParameter(1, OracleTypes.CURSOR);

				// execute getDBUSERCursor store procedure
				boolean hadResults=callableStatement.execute();

				// get cursor and cast it to ResultSet
				//rs = (ResultSet) callableStatement.getObject(2);

				while (hadResults) {

					   ResultSet resultSet = callableStatement.getResultSet();
					  // process result set
	                while (resultSet.next()) {
	                	  String name = resultSet.getString("name");
		                    String path = resultSet.getString("path");
	          
	 
	                    System.out.println(
	                            "| " + name + " | " + path );
	                }
	 
	                
	                
					  
				}

			} catch (SQLException e) {

				System.out.println(e.getMessage());

			} finally {

				if (rs != null) {
					rs.close();
				}

				if (callableStatement != null) {
					callableStatement.close();
				}

				if (dbConnection != null) {
					dbConnection.close();
				}

			}
	 return lst;
		}

}
