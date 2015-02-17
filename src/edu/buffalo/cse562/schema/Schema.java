package edu.buffalo.cse562.schema;

import java.util.ArrayList;
import java.util.Arrays;

public class Schema {

	private String tableName;
	private String tableFile;
	private ArrayList<Column> columns;
	
	public Schema(String tableName, String tableFile) {
		this.tableName = tableName;
		this.tableFile = tableFile;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableFile() {
		return tableFile;
	}

	public void setTableFile(String tableFile) {
		this.tableFile = tableFile;
	}

	public ArrayList<Column> getColumns() {
		return columns;
	}

	public void addColumn(Column column) {
		this.columns.add(column);
	}
	
	public void addColumns(Column columns[]) {
		this.columns.addAll(Arrays.asList(columns));
	}
	
	
	
}
