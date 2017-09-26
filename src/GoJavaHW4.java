import java.util.Scanner;
public class GoJavaHW4 {
    public static void main(String[]args) { chooseTask ( ); }

    public static void chooseTask ( ) {
        Scanner in = new Scanner ( System.in );
        Scanner sc = new Scanner ( System.in );

        int choice;
        int choice2;
        do {
            System.out.println ( "Type the number of Task you want to solve!" );
            System.out.println ( "You have to choose only from 1 to 6:" );
            choice = in.nextInt ( );

            switch ( choice ) {
                case 1:
                    System.out.print ( "n = " );
                    int n = in.nextInt ( );
                    countToNumber ( n );
                    break;
                case 2:
                    System.out.print ( "width = " );
                    int height = in.nextInt ( );
                    System.out.print ( "height = " );
                    int width = in.nextInt ( );
                    drawRectangle ( width , height );
                    break;
                case 3:
                    System.out.print ( "size = " );
                    int size = in.nextInt ( );
                    drawRectangle ( size );
                    break;
                case 4:
                    System.out.print ( "a: " );
                    int a = in.nextInt ( );
                    System.out.print ( "b: " );
                    if ( in.hasNextInt ( ) ) {
                        System.out.println ( "max: " + getMax ( a , in.nextInt ( ) ) );
                    } else {
                        System.out.println ( "max: " + getMax ( a , in.nextFloat ( ) ) );
                    }
                    break;
                case 5:
                    System.out.print ( "Type n: " );
                    int j = in.nextInt ( );
                    recursion ( j );
                    break;
                case 6:
                    System.out.print ( "w = " );
                    int w = in.nextInt ( );
                    System.out.print ( "h = " );
                    int h = in.nextInt ( );
                    System.out.print ( "Type once more h which is equal to r = " );
                    int r = in.nextInt ( );//r = h
                    drawRectangleRecursively ( w , h , r );
                    break;
                case 0:
                    System.exit ( 0 );
                    break;
                default:
                    System.out.println ( "Sorry,you type not from 1 to 6..." );
            }
            System.out.println ( "\n" + "If you want to continue, please, type 1:" );
            choice2 = sc.nextInt ( );
        } while ( choice2 == 1 );
    }

    static void countToNumber ( int n ) {
        int i = 1;
        while ( i <= n ) {
            System.out.println ( i );
            i++;
        }
    }

    static void drawRectangle ( int width , int height ) {
        for ( int i = 0 ; i < width ; i++ ) {
            for ( int j = 0 ; j < height ; j++ ) {
                System.out.print ( "*" );
            }
            System.out.println ( );
        }
    }
        /* Another example
        static String drawRectangle ( int width , int height,char c ) {
        String result = "";
        for ( int i = 0 ; i < height ; i++ ) {
        String line = "";
        for ( int j = 0 ; j < width ; j++ ) {
            line += c;
        }
        result += line + "\n";
    }
        return result;*/

    static void drawRectangle ( int size ) {
        for ( int i = 0 ; i < size ; i++ ) {
            for ( int j = 0 ; j < size ; j++ ) {
                System.out.print ( "*" );
            }
            System.out.println ( );
        }
    }

    static int getMax ( int a , int b ) {
        int max;
        max = a > b ? a : b;
        return max;
    }

    static float getMax ( int a , float b ) {
        float max;
        max = a > b ? a : b;
        return max;
    }

    static float getMax ( float a , float b ) {
        float max;
        max = a > b ? a : b;
        return max;
    }

    static String recursion ( int j ) {
        if ( j == 1 ) {
            return "1";
        }
        return recursion ( j - 1 ) + " " + j;
    }

    static void drawRectangleRecursively ( int height , int width , int r ) {
        if ( height > 0 || width > 0 ) {
            if ( width > 0 ) {
                System.out.print ( "*" );
                drawRectangleRecursively ( height , width - 1 , r );
                return;
            }
            if ( height > 1 ) {
                System.out.println ( );
                drawRectangleRecursively ( height - 1 , r , r );
            }
        }
    }
}
