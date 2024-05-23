package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Drink extends JPanel
{
  JButton[] menu = new JButton[8];
  Main parent;
  
  public Drink( Main main )
  {
    parent = main;
    menu[0] = new JButton("딸기딜라이트요거트");
    menu[1] = new JButton("딸기콜드폼초콜릿");
    menu[2] = new JButton("망고바나나블랜디드");
    menu[3] = new JButton("스타벅스슬래머");
    menu[4] = new JButton("제주까망라떼");
    menu[5] = new JButton("딸기아사이레모네이드");
    menu[6] = new JButton("망고용과레모네이드");
    menu[7] = new JButton("여수바다유자블랜디드");
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
      menu[i].setToolTipText( String.valueOf( i+1 ) + "번째 메뉴 입니다.");
    }
    
    menu[0].setIcon( new ImageIcon("main\\images\\menu2_1.png") );
    menu[1].setIcon( new ImageIcon("main\\images\\menu2_2.png") );
    menu[2].setIcon( new ImageIcon("main\\images\\menu2_3.png") );
    menu[3].setIcon( new ImageIcon("main\\images\\menu2_4.png") );
    menu[4].setIcon( new ImageIcon("main\\images\\menu2_5.png") );
    menu[5].setIcon( new ImageIcon("main\\images\\menu2_6.png") );
    menu[6].setIcon( new ImageIcon("main\\images\\menu2_7.png") );
    menu[7].setIcon( new ImageIcon("main\\images\\menu2_8.png") );
    
    
    setLayout( new GridLayout( 2, 4, 10, 10 ) );
    setPreferredSize( new Dimension( 400, 400 ) );
    setBackground( Color.white );
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
          JButton eBtn = (JButton)e.getSource();
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
            parent.total = check_total;
            parent.tf.setText( String.valueOf( parent.total ) + "원" );
          }
          
          // 리스트에 같은 음료가 있으면...
          if( parent.checkadd == true )
          {
            for( int i = 0; i < parent.table.getRowCount(); i++ )
            {
              if( str.equals( parent.table.getValueAt( i, 0 ) ) )
              {
                int dr_count = (int)( parent.table.getValueAt( i, 1) );
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
            
            parent.total = check_total;
            parent.tf.setText( String.valueOf( parent.total ) + "원" );
            parent.checkadd = false;
          }
          
          parent.table.updateUI();
          
        }
        
        
      });
    }
  }
}