
 // Hotel project
 //It was designed by Engineers
 // 1- Mohamed Al-Awadi
 //2- Mohamed Al-Shami
 // 3 - Abdurrahman khaled Alfaxz

package com.mycompany.lashponatoi;
import java.util.Scanner ;


class Renter {
	
String name ;

int phone_number, 
period,
person_Id,
person_number ;		} ;


public class Lashponatoi {
 
static Scanner in = new Scanner (System.in );

static int num_floor = 10, num_room =8,num_room1, num_floor1,

choose1,choose2,
cost_of_room = 10, new_cost,
Chosen_floor, Chosen_room ,
 back_option, account,
counter = 0
, i , j  ; 


static  Renter person_data [][] = new Renter [ num_floor ] [ num_room ];

static String knowing [][] = new String [ num_floor ] [ num_room ];
static String Floors [] = new String [num_floor ];

static int Cost [][] = new int [num_floor][num_room];
static int TotalCost [][] = new int [ num_floor ] [ num_room ];


public static void main(String[] args) {
 
for( i = 0; i<num_floor ;i++)
for( j = 0; j<num_room ;j++) {
Floors [ i ] = "floor " +(i+1) +" :";
knowing [i][j] = "Null";

Cost [i] [num_room - num_room] = cost_of_room;
Cost[ i ][ j ] = cost_of_room + 2;
Cost[ i ][ num_room - 1] = cost_of_room + 5;
Cost [num_floor - 1][ j ] = cost_of_room +10;
}

System.out.println("Welcome to you Lashpon hotel Where you can find rest and relaxation :");
sleep (2000);
clean ();


do{
System.out.println ("\nTo booking pass 1 :\nTo inquiry pass 2 : " +
" \nTo Pay account pass 3 :" +
"\nSetting pass 4 :" +
"\nTo Exit pass 5 :\n");

choose1 = in.nextInt (); 


switch (choose1) {

case 1: // booking
clean();

System.out.println ("Choose the floor number from the avaliable option :");

for (i = 0; i < num_floor ;i++)
System.out.println (Floors [ i ] );
System.out.println ("\nTo Exit pass 0 :");
Chosen_floor = in.nextInt ();

if (Chosen_floor == 0)
clean();

else if ( Chosen_floor > num_floor || Chosen_floor<1 )  {
System.out.println("It is not an option &");
sleep(2000);
clean();		}

else		{
print_offers ( knowing, Floors , Cost , Chosen_floor);
booken ( knowing, Cost );		}
break ;


case 2: //inquiry
clean();

do {
System.out.println ( "\nGeneral inquiry pass 1 :" +
                    "\nSpeical inquiry pass 2 :" +
                     "\nTo Exit pass 3 :");
 
choose2 = in.nextInt ();
clean();


switch ( choose2 )  {

case 1://General inquiry
print_chart ( knowing, Floors, Cost );
System.out.println("\n\nTo continue pass any number :" +
 "\nTo Exit pass 0:");
back_option = in.nextInt();

counter++;
clean();
break ;


case 2://speical inquiry
System.out.println ("\nChoose floor number :");

for (i = 0; i<num_floor ;i++)
System.out.println (Floors[i]);
Chosen_floor = in.nextInt();

if ( Chosen_floor < num_floor && Chosen_floor > 0 ){
print_offers ( knowing , Floors , Cost, Chosen_floor);
print_data(knowing);
counter++;    }


else {
System.out.println("\nIt is not an option :");
sleep(2000);
clean ();}
break ;

case 0://To back
break ;

default :
System.out.println ("Choose one of the option :\n");
}//end switch inquiry
} while (choose2 != 0 && back_option != 0);
break ;


case 3 ://pay account
 
do {
System.out.print ("\nEnter floor number : ") ;
 Chosen_floor = in.nextInt ();
 
 System.out.print("Enter room number : ");
Chosen_room = in.nextInt ();

if (Chosen_floor < num_floor && Chosen_floor > 0 &&  Chosen_room < num_room && Chosen_room > 0 ) {
 if ( knowing [Chosen_floor-1] [ Chosen_room -1] == "book" ) {

System.out.println ("\nThe Person name is : " + person_data[Chosen_floor-1][ Chosen_room -1].name +
                    "\n Person ID is : " + person_data [Chosen_floor-1] [Chosen_room -1].person_Id +
                    "\nThe Total Cost remaining is : " + TotalCost [Chosen_floor-1] [ Chosen_room -1 ] + " $"+
                    "\n\nEnter the account :");
 account = in.nextInt ();

TotalCost [Chosen_floor-1][ Chosen_room -1] -= account ;
counter++; }
 
else if (knowing [Chosen_floor-1] [ Chosen_room -1] == " Null " )
System.out.println ("The room is null "); }

else
System.out.println("\nThis room can not be found :");
System.out.println("\nTo continue pass any number :"
                 + "\nTo Exit pass 0 :\n");
choose2 = in.nextInt();

} while ( choose2 != 0);
clean();
break ;


case 4: //setting
clean();

System.out.println ("Setting number of floors and rooms pass 1 :" +
                    "\nSetting prices of rooms pass 2 :"+
                    "\nTo Exit pass 0 :");
choose2 = in.nextInt ();

switch ( choose2 ){

case 1:
System.out.print("Set number of floors : ");
num_floor1= in.nextInt ();
num_floor = num_floor1;

System. out.print("Set number of rooms : ");
num_room1= in.nextInt ();
num_room = num_room1;

counter++;
sleep(2000);
clean ();
break ;


case 2:

do  {
System.out.print("Enter number of floor : ");
 Chosen_floor = in.nextInt ();
 
 if (Chosen_floor > num_floor){
 System.out.println ("found only "+num_floor + "floor :");
 continue;  }
 
else if (Chosen_floor == 0 )
break ;


else {
System.out.print ("Enter number of room : ");
 Chosen_room = in.nextInt ();
 
 System.out.println ("The recently cost is : "+Cost [Chosen_floor-1][Chosen_room -1]+" $");
 
System.out.print("Enter the new price :");
new_cost = in.nextInt ();
Cost [Chosen_floor-1][ Chosen_room -1] = new_cost;}
counter++;

System.out.println("\nTo continue pass any number "
                  + "\nTo Exit pass 0 :\n");
    back_option = in.nextInt();

} while (Chosen_floor != 0 && Chosen_room != 0 && back_option !=0);
 break ;
 
case 0:
clean ();
break ;


default :
System.out.println ("Choose one of the avaliable options :");
continue;
}//end switch setting
case 0 : //Exit
break ;


default :
System.out.println ("\nChoose one of the avaliable options :");
continue ;
}//end main switch

}while (choose1 != 0);//end main loop

System.out.println("You did "+ counter + " operation on your program :");
sleep (4000);
clean ();
}//end main function




// The functions of the Projecto:

//First
static void clean ()  {//function delet
System.out.print("\033[H\033[2J");
System.out.flush();	}


//Second
public static void sleep (int milli) {//function stop screen
 try {
 Thread.sleep(milli);
 } catch (InterruptedException enav) {
 enav.printStackTrace(); }		}



//Third
static void print_offers (String knowing [][], String Floors[], int Cost[][],
int Chosen_floor ) {
clean();
System.out.println(Floors [Chosen_floor-1] + "\t Exit 0 :");
System.out.println ("_". repeat(25));


for (i = 0; i<num_room ;i++)
System. out.println(" " + (i+1) + " " + knowing [ Chosen_floor - 1 ][ i ] +" | price " + Cost [Chosen_floor - 1][ i ] + "$" );
System.out.println ("_".repeat (25));
}


// fourth
static String [][] booken (String knowing [][], int Cost [][] ) {

for (i = 0; i< num_room ;i++)  {
System.out.println ("\nEnter room number from the available options :");
 Chosen_room = in.nextInt ();
 
if( Chosen_room == 0)	{
 clean();
 break ;		}


else if (Chosen_room > num_room || Chosen_room < 1 ) {
System.out.println("\nIt is not an option :");
sleep(2000);
clean();
break;	}


else
if (knowing [Chosen_floor-1] [Chosen_room-1] == "Null") {
 
System.out.println("The cost of room is "+ Cost[Chosen_floor-1] [Chosen_room -1] + "$" );
ask_data (Chosen_floor, Chosen_room );
knowing [Chosen_floor-1][Chosen_room -1] = "book";

System.out.println("\nThe room has been booked successfully "); 
counter++;  }

else 
 System.out.println("The room is booked :");

System.out.println("\nTo continue pass any number :" + "\nTo Exit pass 0 :"); 
 back_option = in.nextInt ();

if (back_option == 0)   {
clean();
break; 		}


else
 continue;   }
return knowing ;  }






//fifth
static Renter [][] ask_data (int Chosen_floor , int Chosen_room ){
in.nextLine();

person_data [Chosen_floor-1][ Chosen_room -1] = new Renter ();

System.out.print("\nEnter the Name of the renter :_\t");
person_data [Chosen_floor-1][ Chosen_room -1].name = in.nextLine ();

System.out.print ("How many people with him ? :_\t");
person_data [ Chosen_floor-1 ][ Chosen_room -1].person_number = in.nextInt ();

System.out.print ("Enter the Personal ID : _\t");
person_data [Chosen_floor-1][ Chosen_room -1] . person_Id = in.nextInt ();

System.out.print ("Enter the number of phone :_\t");
person_data [Chosen_floor-1 ][Chosen_room -1].phone_number = in.nextInt();

System.out.print ("How many days of booking :_\t");
person_data [ Chosen_floor-1 ][Chosen_room -1 ].period = in.nextInt();

TotalCost [ Chosen_floor-1][Chosen_room-1] = person_data [ Chosen_floor-1] [Chosen_room -1].period *
Cost[Chosen_floor-1][ Chosen_room -1];

return person_data ;
}

// sexth
static void print_data(String knowing [][] ) {
 T : { for(i = 0; i<num_floor*num_room ;i++){
System.out.println ("\nEnter one of the available options :" );
 Chosen_room = in.nextInt ();

 if ( Chosen_room == 0) {
     clean ();
    break ; }
 
 
else if ( Chosen_room > num_room || Chosen_room<1){
System.out.print("\nIt is not an option :");
sleep(2000);
clean ();   }

else
if ( knowing [Chosen_floor-1][ Chosen_room -1] == "book") {
	
System.out.println ("person name : _ " + person_data[Chosen_floor-1] [ Chosen_room -1].name +

"\nThe Personal ID:_ " + person_data [Chosen_floor-1][ Chosen_room -1].person_Id +

"\nNumber of persons :_ " + person_data[Chosen_floor-1][ Chosen_room -1].person_number +

"\nperiod to booking :_ " + person_data [Chosen_floor-1][ Chosen_room -1].period + " day " +

"\nNumber of phone:_ " + person_data [Chosen_floor-1][ Chosen_room -1].phone_number);
System.out.println ("The Total Cost is :_" + TotalCost[Chosen_floor-1][ Chosen_room -1] + "$"); }


else
System.out.println ("The room number "+ Chosen_room + " is Null :");
System.out.println("\nTo continue pass any number :" +
 " \nTo Exit pass 0 :" );
choose2 = in.nextInt();


if (choose2 == 0)  {
clean ();
break T;      }

else
continue;
} }}



// seventh
static void print_chart (String knowing [][], String Floors[], int Cost[][] ) {
clean();

for(i = 0; i<num_floor ;i++){
System.out.println ("\n"+Floors [i] );

System.out.println ("_". repeat(25));

for(j = 0; j<num_room ;j++)
System. out.println(" "+ (j+1) +" "+ knowing[i][j] +" | price "+ Cost [i][ j ]+"$" );
System.out.println ("_".repeat (25));
}}
}//end main class