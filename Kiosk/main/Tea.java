package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

// import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tea extends JPanel
{
  Main parent;
  JButton[] menu = new JButton[8];
  
  Tea()
  {
    
  }
  
  Tea ( Main i )
  {
    parent = i;
    
    menu[0] = new JButton("민트블랜드티");
    menu[1] = new JButton("얼그레이티");
    menu[2] = new JButton("캐모마일블랜드티");
    menu[3] = new JButton("히비스커스블랜드티");
    menu[4] = new JButton("제주말차라떼");
    menu[5] = new JButton("제주유기농녹차티");
    menu[6] = new JButton("클래식밀크티");
    menu[7] = new JButton("차이티라떼");
    
    addLayout();
    eventProc();
  }
  
  public void addLayout()
  {
    for( int i = 0; i < menu.length; i++ )
    {
      add(menu[i]);
      menu[i].setVerticalTextPosition( JButton.BOTTOM );
      menu[i].setHorizontalTextPosition( JButton.CENTER );
      menu[i].setPreferredSize( new Dimension( 120, 120 ) );
      menu[i].setToolTipText( String.valueOf( i+1 ) );
    }
    
    menu[0].setIcon( new ImageIcon("main\\images\\menu4_1.png") );
    menu[1].setIcon( new ImageIcon("main\\images\\menu4_2.png") );
    menu[2].setIcon( new ImageIcon("main\\images\\menu4_3.png") );
    menu[3].setIcon( new ImageIcon("main\\images\\menu4_4.png") );
    menu[4].setIcon( new ImageIcon("main\\images\\menu4_5.png") );
    menu[5].setIcon( new ImageIcon("main\\images\\menu4_6.png") );
    menu[6].setIcon( new ImageIcon("main\\images\\menu4_7.png") );
    menu[7].setIcon( new ImageIcon("main\\images\\menu4_8.png") );
    
    setPreferredSize( new Dimension( 400, 400 ) );
    setBackground( Color.WHITE );
    setLayout( new GridLayout( 2, 4, 10, 10 ) );
  }
  
  public void eventProc()
  {
    for( int i = 0; i < menu.length; i++ )
    {
      menu[i].addActionListener( new ActionListener()
      {
        @Override
        public void actionPerformed( ActionEvent e )
        {
          JButton eBtn = ( JButton )e.getSource();
          String str = eBtn.getText();
          String menuname = str;
          int money = parent.menu.get(str);
          Object[] newRow = { menuname, 1, money };
          int c_row = parent.table.getRowCount();
          
          if( c_row > 0)
          {
            for( int j = 0; j < parent.table.getRowCount(); j++)
            {
              if( str.equals( parent.table.getValueAt( j, 0)) == true)
              {
                // System.out.println(parent.table.getValueAt( j, 1));
                parent.checkadd = true;
              }
            }
          }
          
          // 리스트에 없으면...
          if( parent.checkadd == false )
          {
            parent.dtm.addRow(newRow);
            // Total 금액 다시계산
            int check_total = 0;
            for( int i = 0; i < parent.table.getRowCount(); i++ )
            {
              check_total += ((int)parent.table.getValueAt( i, 1) * (int)parent.table.getValueAt( i, 2));
            }
            // System.out.println(check_total);
            parent.total = check_total;
            parent.tf.setText( String.valueOf( parent.total ) + "원" );
            // parent.checkadd = false;
          }
          
          // 리스트에 같은 음료가 있으면...
          if( parent.checkadd == true )
          {
            for( int i = 0; i < parent.table.getRowCount(); i++ )
            {
              if( str.equals( parent.table.getValueAt( i, 0 ) ) )
              {
                int dr_count = (int)( parent.table.getValueAt( i, 1) );
                // System.out.println(dr_count);
                dr_count++;
                parent.table.setValueAt(dr_count, i, 1);
              }
            }
            
            // Total 금액 다시계산
            int check_total = 0;
            for( int i = 0; i < parent.table.getRowCount(); i++ )
            {
              check_total += ((int)parent.table.getValueAt( i, 1) * (int)parent.table.getValueAt( i, 2));
            }
            // System.out.println(check_total);
            parent.total = check_total;
            parent.tf.setText( String.valueOf( parent.total ) + "원" );
            
            
            // System.out.println("음료가 있다. 카운트++");
            parent.checkadd = false;
          }
          parent.table.updateUI();
        }
      } );
    }
  }
}
