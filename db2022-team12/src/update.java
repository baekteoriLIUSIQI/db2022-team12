public static void main(String[] args) throws SQLException {
		ConnectionClass conn = new ConnectionClass();
		Connection con = conn.getConnection();
		String selectSql = "SELECT * FROM member";
		Statement result = con.createStatement();
		ResultSet rs = result.executeQuery(selectSql);
		System.out.println("Searchsql:" + selectSql + "; SearchReasult=====================>);
		while(rs.next()){
			System.out.println(rs.getString("Member_name"));
		}
		String updSql = "update member set Member_name = ? where id =?";
	    PreparedStatement ps = con.prepareStatement(updSql);
	    ps.setObject(1,"TEST");
	    ps.setObject(2,"liu1771");
	    ps.execute();
	    con.close();
	}
