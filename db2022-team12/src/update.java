public static void main(String[] args) throws SQLException {
		ConnectionClass conn = new ConnectionClass();
		//获取连接
		Connection con = conn.getConnection();
		//查询操作===============
		String selectSql = "SELECT * FROM member";
		//创建节点
		Statement result = con.createStatement();
		//获取结果
		ResultSet rs = result.executeQuery(selectSql);
		System.out.println("Searchsql:" + selectSql + "; SearchReasult=====================>);
		while(rs.next()){
			System.out.println(rs.getString("Member_name"));
		}
		//修改操作===============
		String updSql = "update member set Member_name = ? where id =?";
	    PreparedStatement ps = con.prepareStatement(updSql);
	    //填充占位�?
	    ps.setObject(1,"TEST");
	    ps.setObject(2,"liu1771");
	    //执行sql
	    ps.execute();
	    //执行完后释放连接
	    con.close();
	}