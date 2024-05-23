package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Coffee extends JPanel
{
  JButton[] btn;
  
  Main parent;
  
  public Coffee( Main main )
  {
    parent = main;
    btn = new JButton[8];
    btn[0] = new JButton("아메리카노");
    btn[1] = new JButton("에스프레소");
    btn[2] = new JButton("카페모카");
    btn[3] = new JButton("카페라떼");
    btn[4] = new JButton("카라멜마키아또");
    btn[5] = new JButton("자바칩프라푸치노");
    btn[6] = new JButton("화이트초콜릿모카");
    btn[7] = new JButton("돌체라떼");
    
    addLayout();
    eventProc();
  }
  
  public void addLayout()
  {
    for( int i = 0; i < btn.length; i++ )
    {
      add(btn[i]);
      btn[i].setPreferredSize( new Dimension( 120, 120 ) );
      btn[i].setVerticalTextPosition( JButton.BOTTOM );
      btn[i].setHorizontalTextPosition( JButton.CENTER );
      btn[i].setToolTipText( String.valueOf( i+1 ) + "번째 메뉴 입니다." );
    }
    
    btn[0].setIcon( new ImageIcon("main\\images\\menu1_1.png") );
    btn[1].setIcon( new ImageIcon("main\\images\\menu1_2.png") );
    btn[2].setIcon( new ImageIcon("main\\images\\menu1_3.png") );
    btn[3].setIcon( new ImageIcon("main\\images\\menu1_4.png") );
    btn[4].setIcon( new ImageIcon("main\\images\\menu1_5.png") );
    btn[5].setIcon( new ImageIcon("main\\images\\menu1_6.png") );
    btn[6].setIcon( new ImageIcon("main\\images\\menu1_7.png") );
    btn[7].setIcon( new ImageIcon("main\\images\\menu1_8.png") );
    
    setPreferredSize( new Dimension( 175, 200 ) );
    setBackground( Color.white );
    setLayout( new GridLayout( 2, 4, 10, 10 ) );
  }
  
  public void eventProc()
  {
    
    for( int i = 0; i < btn.length; i++ )
    {
      
      btn[i].addActionListener( new ActionListener()
      {
        
        @Override
        public void actionPerformed( ActionEvent e )
        {
          JButton eBtn = ( JButton )e.getSource();
          String str = eBtn.getText();
          // JOptionPane.showMessageDialog( null, str + "의 가격은 \t" + parent.menu.get(str) + "원 입니다.");
          String menuname = str;
          int money = parent.menu.get(str);
          Object[] newRow = { menuname, 1, money };
          
          // int c_col = parent.table.getSelectedColumn();
          int c_row = parent.table.getRowCount();
          // System.out.println( c_row );
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
          
          
          
          //   if( str.equals( parent.table.getSe) )
          //   {
          //     parent.dtm.setValueAt(e, j, i);
          //   }
          //   else
          //   {
          //     // 테이블에 오브젝트 넣기
              
          //   }
          // }
          // parent.dtm.getRowCount(1).
          // parent.contents[0][1]
          // Object[] read = parent.table.getValueAt(1, 1);
          // String name = 
          // System.out.println( parent.table.getValueAt(0, 0));
          // 테이블 업데이트
          parent.table.updateUI();

          
          // if( str.length() < 7 )
          // {
          //   parent.ta.append( str + "\t\t" + parent.menu.get(str) + "원\n");
          //   parent.total += parent.menu.get( str );
          //   parent.tf.setText( String.valueOf( parent.total ) + "원" );
          // }
          // else
          // {
          //   parent.ta.append( str + "\t" + parent.menu.get(str) + "원\n");
          //   parent.total += parent.menu.get( str );
          //   parent.tf.setText( String.valueOf( parent.total ) + "원" );
          // }
          
        }
      } );
    }
  }
}
