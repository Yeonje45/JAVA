package com.market.main;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.market.bookitem.Book;
import com.market.cart.Cart;
import com.market.member.Admin;
import com.market.member.User;
import com.market.exception.CartException;;

// 143페이지부터 수정하면됨
public class Welcome
{
    
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;
    // static CartItem[] mCartItems = new CartItem[NUM_BOOK];
    // static int mCartCount = 0;
    static Cart mCart = new Cart();
    static User mUser;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // String[][] mBook = new String[NUM_BOOK][NUM_ITEM];
        // Book[] mBookList = new Book[NUM_BOOK];
        Book[] mBookList;
        int mTotalBook = 0;
        int menu_number = 0;

        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = sc.next();
        System.out.print("연락처를 입력하세요 : ");
        int userMobile = sc.nextInt();

        mUser = new User(userName, userMobile);

        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";

        boolean p_bookroot = false;

        while(p_bookroot == false )
        {
            System.out.println("**************************************************************");
            System.out.printf("               %s\n", greeting);
            System.out.printf("               %s\n", tagline);
            
            // 메뉴판 반복 호출
            menuIntroducion();

            try
            {
                System.out.println("메뉴 번호를 선택해주세요 : ");
                menu_number = sc.nextInt();
                System.out.printf("%d번을 선택했습니다.\n", menu_number);
                if( menu_number < 1 || menu_number > 9 )
                {
                    System.out.println("1부터 9까지의 숫자를 입력하세요.");
                }
                else
                {
                    switch (menu_number) 
                    {
                        
                        case 1: // 현재 고객 정보
                        {
                            menuGuestInfo( userName, userMobile );
                            break;
                        }
                        case 2: // 장바구니 상품 목록 보기
                        {
                            menuCartItemList();
                            break;
                        }
                        case 3: // 장바구니 비우기
                        {
                            menuCartClear();
                            break;
                        }
                        case 4: // 장바구니에 항목 추가하기
                        {
                            mTotalBook = totalFileToBookList();
                            mBookList = new Book[mTotalBook];
                            menuCartAddItem( mBookList );
                            break;
                        }
                        case 5: // 장바구니의 항목 수량 줄이기
                        {
                            menuCartRemoveItemCount();
                            break;
                        }
                        case 6: // 장바구니의 항목 삭제하기
                        {
                            menuCartRemoveItem();
                            break;
                        }
                        case 7: // 영수증 표시하기
                        {
                            menuCartBill();
                            break;
                        }
                        case 8: // 종료
                        {
                            menuExit();
                            break;
                        }
                        case 9:
                        {
                            menuAdminLogin();
                            break;
                        }
                        
                    }
                }
            }
            catch(CartException e)
            {
                System.out.println( e.getMessage() );
                p_bookroot = true;
            }
            catch(Exception e)
            {
                System.out.println("올바르지 않은 메뉴 선택으로 종료합니다.");
                p_bookroot = true;
            }
        }
        sc.close();
    }

    //////////////////////////// 메서드 라인

    // 1. 고객 정보 확인
    public static void menuGuestInfo( String name, int mobile )
    {
        System.out.println("현재 고객 정보 : ");
        // Person person = new Person( name, mobile );
        // System.out.println("이름 : " + name + " 연락처 : " + mobile );

        System.out.println("이름 " + mUser.getName() + "     연락처" + mUser.getPhone() );

    }

    // 2. 장바구니 상품 목록 보기
    public static void menuCartItemList()
    {
        // System.out.println("장바구니 상품 목록 : ");
        // System.out.println("----------------------------------------------------");
        // System.out.println("            도서ID |        수량 |            합계 |");
        
        // for( int i = 0; i < mCart.mCartCount; i++ )
        // {
        //     System.out.print("          " + mCartItem[i].getBookID() + " | ");
        //     System.out.print("          " + mCartItem[i].getQuantity() + " | ");
        //     System.out.print("          " + mCartItem[i].getTotalPrice() + " | ");
        //     System.out.println("    ");
        // }
        // System.out.println("----------------------------------------------------");
        if( mCart.mCartCount >= 0 )
        {
            mCart.printCart();
        }
    }

    // 3. 장바구니 비우기
    public static void menuCartClear()
    {
        if( mCart.mCartCount == 0 )
        {
            System.out.println("장바구니에 항목이 없습니다.");
        }
        else
        {
            System.out.println("장바구니의 모든 항목을 삭제하겠습니까? Y | N : ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            if( str.toUpperCase().equals("Y") )
            {
                System.out.println("장바구니의 모든 항목을 삭제했습니다.");
                mCart.deleteBook();
            }
        }
    }

    // 4. 바구니에 항목 추가하기
    public static void menuCartAddItem( Book[] booklist )
    {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;

        BookList( booklist );

        // for( int i = 0; i < NUM_BOOK; i++ )
        // {
        //     for( int j = 0; j < NUM_ITEM; j++ )
        //     {
        //         System.out.printf("%s | ", book[i][j] );
        //     }
        //     System.out.print("\n");
        // }
        mCart.printBookList( booklist );

        while( quit == false )
        {
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");
            String str = sc.nextLine();

            boolean flag = false;
            int numId = -1;

            for( int i = 0; i < NUM_BOOK; i++ )
            {
                if( str.equals( booklist[i].getBookId() ) )
                {
                    numId = i;
                    flag = true;
                    break;
                }
            }
            if( flag )
            {
                System.out.print("장바구니에 추가하겠습니까? Y | N : ");
                str = sc.nextLine();

                if( str.toUpperCase().equals("Y") )
                {
                    System.out.printf(" %s 도서가 장바구니에 추가되었습니다.\n", booklist[numId].getBookId() );
                    
                    // 장바구니에 넣기
                    if( !isCartInBook( booklist[numId].getBookId() ) )
                    {
                        // mCartItem[mCartCount++] = new CartItem( book[numId] );
                        mCart.insertBook(booklist[numId]);
                    }
                }
                quit = true;
            }
            else
            {
                System.out.println("다시 입력해 주세요.");
            }
        }
    }

    // 5. 장바구니의 항목 수량 줄이기
    public static void menuCartRemoveItemCount()
    {

    }

    // 6. 장바구니의 항목 삭제하기
    public static void menuCartRemoveItem() throws CartException
    {
        if( mCart.mCartCount == 0 )
        {
            throw new CartException("장바구니에 항목이 없습니다.");
        }
        else
        {
            menuCartItemList();
            boolean quit = false;

            while( !quit )
            {
                System.out.println("장바구니에서 삭제할 도서의 ID를 입력하세요 : ");
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();

                boolean flag = false;
                int numId = -1;

                for( int i = 0; i < mCart.mCartCount; i++ )
                {
                    if( str.equals( mCart.mCartItem[i].getBookID() ) )
                    {
                        numId = i;
                        flag = true;
                        break;
                    }
                }
                if( flag )
                {
                    System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N : ");
                    str = sc.nextLine();

                    if( str.toUpperCase().equals("Y") )
                    {
                        System.out.println(mCart.mCartItem[numId].getBookID() + " 장바구니에서 도서가 삭제되었습니다.");
                        // 배열이동
                        mCart.removeCart(numId);
                    }
                    quit = true;
                    
                }
                else
                {
                    System.out.println("다시 입력해 주세요");
                }   
            }  
        }
    }

    // 7. 영수증 표시하기
    public static void menuCartBill() throws CartException
    {
        if( mCart.mCartCount == 0 )
        {
            throw new CartException("장바구니에 항목이 없습니다.");
        }
        else
        {
            System.out.print("배송받을 분은 고객 정보와 같습니까? Y | N : ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            if( str.toUpperCase().equals("Y") )
            {
                System.out.print("배송지를 입력해주세요 : ");
                String address = sc.nextLine();

                printBill( mUser.getName(), String.valueOf(  mUser.getPhone() ), address);
            }
            else
            {
                System.out.print("배송받을 고객명을 입력하세요 : ");
                String name = sc.nextLine();
                System.out.print("배송받을 고객명을 입력하세요 : ");
                String phone = sc.nextLine();
                System.out.print("배송받을 고객명을 입력하세요 : ");
                String address = sc.nextLine();

                printBill(name, phone, address);
            }
        }
    }

    // 8. 종료
    public static void menuExit()
    {

    }

    // 9. 관리자 로그인
    public static void menuAdminLogin()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("관리자 정보를 입력하세요");
        System.out.print("아이디 : ");
        String adminId = sc.next();

        System.out.print("비밀번호 : ");
        String adminPW = sc.next();

        Admin admin = new Admin( mUser.getName(), mUser.getPhone() );

        if( adminId.equals( admin.getId()) && adminPW.equals( admin.getPassword() ) )
        {
            String[] writeBook = new String[7];
            System.out.print("도서 정보를 추가하겠습니까? Y | N : ");
            String str = sc.next();

            if( str.toUpperCase().equals("Y") )
            {
                Date date = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyMMddhhmmss");
                String strDate = formatter.format(date);
                writeBook[0] = "ISBN" + strDate;
                System.out.println("도서ID : "+ writeBook[0] );
                String st1 = sc.nextLine();  // 키보드를 한 행 입력시 엔터키를 입력으로 처리
                // 키보드로 한 행씩 입력받은 도서 정보를 배열 writeBook에 저장
                System.out.print("도서명 : ");
                writeBook[1] = sc.nextLine();
                System.out.print("가격 : ");
                writeBook[2] = sc.nextLine();
                System.out.print("저자 : ");
                writeBook[3] = sc.nextLine();
                System.out.print("설명 : ");
                writeBook[4] = sc.nextLine();
                System.out.print("분야 : ");
                writeBook[5] = sc.nextLine();
                System.out.print("출판일 : ");
                writeBook[6] = sc.nextLine();

                try
                {
                    // book.txt 파일에 쓰기 위해 FileWriter 객체 생성
                    // 기존 파일에 쓰기 위해 FileWriter 생성자에 true로 작성
                    FileWriter fw = new FileWriter("book.txt", true);

                    // 새로 입력받은 도서 정보를 book.txt 파일에 저장
                    for( int i = 0; i < 7; i++ )
                    {
                        fw.write( writeBook[i] + "\n" );
                        fw.close();
                        System.out.println("새 도서 정보가 저장되었습니다.");
                    }
                }
                catch( Exception e )
                {
                    System.out.println(e);
                }
            }
            else
            {
                System.out.println("이름" + admin.getName() + "    연락처 " + admin.getPhone() );
                System.out.println("아이디" + admin.getId() + "    비밀번호 " + admin.getPassword() );
            }

            
        }
        else
        {
            System.out.println("관리자 정보가 일치하지 않습니다.");
        }
    }


    // 메뉴
    public static void menuIntroducion()
    {
        System.out.println("**************************************************************");
        System.out.println("1. 고객 정보 확인하기          4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기     5. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기             6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기             8. 종료");
        System.out.println("9. 관리자 로그인");
        System.out.println("**************************************************************");
    }

    // 도서정보를 저장하는 메서드
    public static void BookList( Book[] booklist )
    {
        setFileToList(booklist);
        // booklist[0] = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000 );
        // booklist[0].setAuthor("송미영");
        // booklist[0].setDescription("단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍");
        // booklist[0].setCategory("IT전문서");
        // booklist[0].setReleaseDate("2018/10/08");

        // booklist[1] = new Book("ISBN1235", "안드로이드 프로그래밍", 33000 );
        // booklist[1].setAuthor("우재남");
        // booklist[1].setDescription("실습 단계별 명쾌한 멘토링!");
        // booklist[1].setCategory("IT전문서");
        // booklist[1].setReleaseDate("2022/01/22");

        // booklist[2] = new Book("ISBN1236", "스크래치", 22000 );
        // booklist[2].setAuthor("고광일");
        // booklist[2].setDescription("컴퓨팅 사고력을 키우는 블록 코딩");
        // booklist[2].setCategory("컴퓨터 입문");
        // booklist[2].setReleaseDate("2019/06/10");
    }

    // 장바구니 항목 추가
    public static boolean isCartInBook( String bookId )
    {
        // boolean flag = false;

        // for( int i = 0; i < mCart.mCartCount; i++ )
        // {
        //     if( bookId == mCart.mCartItems[i].getBookID() )
        //     {
        //         mCart.mCartItems[i].setQuantity( mCart.mCartItems[i].getQuantity()+1 );
        //         flag = true;
        //     }
        // }

        return mCart.isCartInBook(bookId);
    }

    public static void printBill( String name, String phone, String address )
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("");
        System.out.println("------------------ 배송받을 고객 정보 ------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("고객명 : " + name + "          연락처 : " + phone );
        System.out.println(" 배송지 : " + address + "        발송일 : " + strDate );

        // 장바구니에 담긴 항목 출력
        mCart.printCart();

        // 장바구니에 담긴 항목의 총 금액 산출
        int sum = 0;
        for( int i = 0; i < mCart.mCartCount; i++ )
        {
            sum += mCart.mCartItem[i].getTotalPrice();
        }
        System.out.println("                   주문 총금액 : " + sum + "원\n");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
    }

    // 파일을 열고 파일에서 도서의 개수를 얻는 메서드
    public static int totalFileToBookList()
    {
        try
        {
            // book.txt 파일을 읽기 위한 FileReader 객체 생성
            FileReader fr = new FileReader("book.txt");
            // 파일에서 한 행씩 읽기 위한 BufferedReader 객체 생성
            BufferedReader reader = new BufferedReader(fr);

            String str;

            // 도서의 개수를 저장하기 위해 선언한 지역변수
            int num = 0;

            // 파일에서 읽을 행이 없을 때 까지 반복
            while( ( str = reader.readLine() ) != null )
            {
                // 파일에서 읽은 한 행에 문자열 ISBN이 포함되어있으면 도서의 갯수를 1증가시킴
                if( str.contains("ISBN") )
                {
                    ++num;
                }
            }

            // BufferedReader 객체 종료
            reader.close();
            // FileReader 객체 종료
            fr.close();

            return num;
        }
        catch( Exception e )
        {
            System.out.println(e);
        }
        return 0;
    } 

    // 도서를 읽고 저장하기
    public static void setFileToList( Book[] booklist )
    {
        try
        {
            FileReader fr = new FileReader("book.txt");
            BufferedReader reader = new BufferedReader(fr);

            String str2;
            String[] readBook = new String[7];

            int count = 0;

            // 파일에서 읽을 행이 없을 때 까지 반복
            while( (str2 = reader.readLine() ) != null )
            {
                // 파일에서 읽은 ISBN이 포함되어있으면 도서정보에 대해 한 행씩 읽어 지역변서 readBook에 저장
                if( str2.contains("ISBN") )
                {
                    readBook[0] = str2;
                    readBook[1] = reader.readLine();
                    readBook[2] = reader.readLine();
                    readBook[3] = reader.readLine();
                    readBook[4] = reader.readLine();
                    readBook[5] = reader.readLine();
                    readBook[6] = reader.readLine();
                }

                booklist[ count++ ] = new Book( readBook[0], readBook[1], Integer.parseInt( readBook[2] ), readBook[3], readBook[4], readBook[5], readBook[6] );
            }

            reader.close();
            fr.close();
        }
        catch( Exception e )
        {
            System.out.println(e);
        }
    }
}