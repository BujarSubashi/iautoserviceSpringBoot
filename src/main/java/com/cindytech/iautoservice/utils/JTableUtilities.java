package com.cindytech.iautoservice.utils;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import java.awt.*;

public class JTableUtilities { 

	public static void setCellsAlignmentBoard(JTable table){

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		TableModel tableModel = table.getModel();

		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
		}
	}

	public static void setCellsAlignmentPos(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		headerRenderer.setFont(new Font("Arial", Font.BOLD, 12));
		//headerRenderer.setForeground(new Color(204, 204,0));

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){

			if (columnIndex == 2  ) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
			}
			if (columnIndex == 0 || columnIndex == 1 || columnIndex == 3) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}

		}

		// Defines table's column width.
		int[] columnsWidth = { 10, 70, 40, 20};

		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			//column.setMaxWidth(width);
			column.setPreferredWidth(width);
		}
	}

	public static void setCellsAlignmentProduct(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 0 || columnIndex == 6 || columnIndex == 8) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}
			if (columnIndex == 1 || columnIndex == 2 || columnIndex == 3 ) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(leftRenderer);
			}
			if (columnIndex == 6 || columnIndex == 7 ) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
			}
		}

		int[] columnsWidth = {50,60, 90, 80, 90, 80, 40, 40, 60 };
		//int[] columnsMaxWidth = { 90, 90, 60, 90, 70, 70 };

		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);

			/*for (int maxWidth : columnsMaxWidth) {
				column.setMaxWidth(maxWidth);
			}*/
			column.setPreferredWidth(width);
		}

	}

	public static void setCellsAlignmentSale(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();

		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 0 || columnIndex == 1 || columnIndex == 2 || columnIndex == 3 || columnIndex == 5) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}
			if (columnIndex == 4 || columnIndex == 6) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
			}
		}

		// Defines table's column width.
		int[] columnsWidth = {0, 50, 110, 60, 70, 50};

		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			//column.setMaxWidth(width);
			column.setPreferredWidth(width);
		}
	}

	public static void setCellsAlignmentSaleLineItem(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 0 || columnIndex == 1) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(leftRenderer);
			}
			if (columnIndex == 2) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
			}	
			if ( columnIndex == 3) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}


		}

		// Defines table's column width.
		int[] columnsWidth = {70, 60, 50, 30};

		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			//column.setMaxWidth(width);
			column.setPreferredWidth(width);
		}
	}

	public static void setCellsAlignmentUsers(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			
			if (columnIndex == 0 || columnIndex == 1 || columnIndex == 2 || columnIndex == 3 || columnIndex == 4) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(leftRenderer);
			}
			if (columnIndex == 5) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}
		}

		int[] columnsWidth = { 5, 70, 70, 70, 70, 60 };
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			column.setPreferredWidth(width);
		}

		table.getColumnModel().getColumn(0).setMinWidth(0);
		table.getColumnModel().getColumn(0).setMaxWidth(0);
		table.getColumnModel().getColumn(0).setWidth(0);
	}



	public static void setCellsAlignmentCategory(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){

			if (columnIndex == 0 ) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}

			if (columnIndex == 1 ) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(leftRenderer);
			}
		}

		// Defines table's column width.
		int[] columnsWidth = {150};

		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			column.setMaxWidth(width);
			column.setPreferredWidth(width);
		}
	}

	public static void setCellsAlignmentShtimTerheqje(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 3 || columnIndex == 4) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
			}
			if (columnIndex == 0 || columnIndex == 1 || columnIndex == 2 || columnIndex == 5 || columnIndex == 6) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}

		}

		// Defines table's column width.
		int[] columnsWidth = { 120, 60, 40,80, 80, 90, 130 };

		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			//column.setMaxWidth(width);
			column.setPreferredWidth(width);
		}
	}
}