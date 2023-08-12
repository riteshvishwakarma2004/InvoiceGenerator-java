import java.util.*;


class BASE{                         //tracker
    static int[] proBP= new int[50];           //proBP == product base price
    static int[] proQY= new int[50];           //proQY == product quantity
    static int[] proTP= new int[50];           //proTP == product total price
    static String[] proNAME= new String[50];   //proNAME == product name
    static int sum=0;                          // this is total sum of amount 
    static int n=0;                          //total number of products
}

class ELECTRONICS extends BASE{
    Scanner sc=new Scanner(System.in);
    int QUANTITY;
    int sump=0;    //used for sum of each product 
    int code,x;
    void order()
    {
        do{
        System.out.println("\n");
        System.out.print("ENTER YOUR PRODUCT CODE: ");
        code=sc.nextInt();
        switch(code)
        {
            case 111 : System.out.println("MOTO G30 \n Rate: 12000/-");
                       proNAME[n]="MOTO G30";
                       proBP[n]=12000;
                       System.out.println("How many 'MOTO G30' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*12000);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 112 :  System.out.println("REDMI 11 prime 5G \n Rate: 15000/-");
                        proNAME[n]="REDMI 11 prime 5G";
                        proBP[n]=15000;
                        System.out.println("How many 'REDMI 11 prime 5G' are you adding to your cart? (QUANTITY)");
                        QUANTITY=sc.nextInt();
                        proQY[n]=QUANTITY;
                        sump=(QUANTITY*15000);
                        proTP[n]=sump;
                        sum=sum+sump;
                        n++;
                        System.out.println("\n");
                        break;    

            case 113 : System.out.println("IQOO Z5 5G \n Rate: 22000/-");
                       proNAME[n]="IQOO Z5 5G";
                       proBP[n]=22000;
                       System.out.println("How many 'IQOO Z5 5G' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*22000);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 114 : System.out.println("OPPO F17 pro \n Rate: 18000/-");
                       proNAME[n]="OPPO F17 pro";
                       proBP[n]=18000;
                       System.out.println("How many 'OPPO F17 pro' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*18000);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;
                       
            case 115 : System.out.println("MOONWALK mini earbud \n Rate: 600/-");
                       proNAME[n]="MOONWALK mini earbud";
                       proBP[n]=600;
                       System.out.println("How many 'MOONWALK mini earbud' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*600);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 116 : System.out.println("Lenovo Ideapad 3 \n Rate: 51000/-");
                       proNAME[n]="Lenovo ideapad 3";
                       proBP[n]=51000;
                       System.out.println("How many 'Lenovo ideapad 3' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*51000);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 117 : System.out.println("Dell mouse \n Rate: 500/-");
                       proNAME[n]="Dell mouse";
                       proBP[n]=500;
                       System.out.println("How many 'Dell mouse' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*500);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 118 : System.out.println("Sandisk Pendrive 32GB \n Rate: 2000/-");
                       proNAME[n]="Sandisk pendrive 32GB";
                       proBP[n]=2000;
                       System.out.println("How many 'Sandisk pendrive 32GB' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*2000);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 119 : System.out.println("LG TV \n Rate: 49999/-");
                       proNAME[n]="LG TV";
                       proBP[n]=49999;
                       System.out.println("How many 'LG TV' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*49999);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;
                       
            case 120 : System.out.println("Samsung washing machine \n Rate: 35000/-");
                       proNAME[n]="Sansung washing machine";
                       proBP[n]=35000;
                       System.out.println("How many 'Samsung washing machine' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*35000);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 
                       
            default : System.out.println("enter valid product code ");
                     
        }

        System.out.println("Do you want to add more products in your cart? \n1.YES    2.NO");
        x=sc.nextInt();

    }while(x!=2);
}

}

class FASHION extends BASE{
    Scanner sc=new Scanner(System.in);
    int QUANTITY;
    int sump=0;
    int code,x;
    void order()
    {
        do{
        System.out.println("\n");
        System.out.print("ENTER YOUR PRODUCT CODE: ");
        code=sc.nextInt();
        switch(code)
        {
            case 210 : System.out.println("Men's T-Shirt \n Rate: 299/-");
                       proNAME[n]="Men's T-Shirt";
                       proBP[n]=299;
                       System.out.println("How many 'Men's T-Shirt' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*299);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 211 :  System.out.println("Men's Shirt \n Rate: 499/-");
                        proNAME[n]="Men's Shirt";
                        proBP[n]=499;
                        System.out.println("How many 'Men's Shirt' are you adding to your cart? (QUANTITY)");
                        QUANTITY=sc.nextInt();
                        proQY[n]=QUANTITY;
                        sump=(QUANTITY*499);
                        proTP[n]=sump;
                        sum=sum+sump;
                        n++;
                        System.out.println("\n");
                        break;    

            case 212 : System.out.println("Men's Jeans\n Rate: 799/-");
                       proNAME[n]="Men's Jeans";
                       proBP[n]=799;
                       System.out.println("How many 'Men's Jeans' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*799);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 213 : System.out.println("men's shorts \n Rate: 195/-");
                       proNAME[n]="Men's shorts";
                       proBP[n]=195;
                       System.out.println("How many 'Men's shorts' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*195);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 214 : System.out.println("Men's jogger\n Rate: 599/-");
                       proNAME[n]="Men's jogger";
                       proBP[n]=599;
                       System.out.println("How many 'Men's jogger' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*599);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 215 : System.out.println("Casual shoes\n Rate: 999/-");
                       proNAME[n]="Casual shoes";
                       proBP[n]=999;
                       System.out.println("How many 'Casual shoes' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*999);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 216 : System.out.println("Mens Analog Watch\n Rate: 5999/-");
                       proNAME[n]="Men's Analog Watch";
                       proBP[n]=5999;
                       System.out.println("How many 'Men's Analog Watch' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*5999);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 217 : System.out.println("Men's deodorant\n Rate: 200/-");
                       proNAME[n]="Men's Deodorant";
                       proBP[n]=200;
                       System.out.println("How many 'Men's Deodorant' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*200);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 218 : System.out.println("Men's Jacket\n Rate: 1099/-");
                       proNAME[n]="Men's Jacket";
                       proBP[n]=1099;
                       System.out.println("How many 'Men's Jacket' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*1099);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 219 : System.out.println("Men's SmartWatch\n Rate: 1999/-");
                       proNAME[n]="Men's SmartWatch";
                       proBP[n]=1999;
                       System.out.println("How many 'Men's SmartWatch' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*1999);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;
                       
            default : System.out.println("enter valid product code ");
                     
        }

        System.out.println("Do you want to add more products in your cart? \n1.YES    2.NO");
        x=sc.nextInt();

    }while(x!=2);
}

}

class STATIONARY extends BASE{
    Scanner sc=new Scanner(System.in);
    int QUANTITY;
    int sump=0;
    int code,x;
    void order()
    {
        do{
        System.out.println("\n");
        System.out.print("ENTER YOUR PRODUCT CODE: ");
        code=sc.nextInt();
        switch(code)
        {
            case 711 : System.out.println("Eraser (pack of 10)\n Rate: 20/-");
                       proNAME[n]="Eraser (pack of 10)";
                       proBP[n]=20;
                       System.out.println("How many 'Eraser (pack of 10)' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*20);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 712 :  System.out.println("Pen (pack of 10) \n Rate: 100/-");
                        proNAME[n]="Pen (pack of 10)";
                        proBP[n]=100;
                        System.out.println("How many 'Pen (pack of 10)' are you adding to your cart? (QUANTITY)");
                        QUANTITY=sc.nextInt();
                        proQY[n]=QUANTITY;
                        sump=(QUANTITY*100);
                        proTP[n]=sump;
                        sum=sum+sump;
                        n++;
                        System.out.println("\n");
                        break;    

            case 713 : System.out.println("NoteBook (set of 12) \n Rate: 515/-");
                       proNAME[n]="NoteBook (set of 12)";
                       proBP[n]=515;
                       System.out.println("How many 'NoteBook (set of 12)' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*515);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 714 : System.out.println("Apsara Pencil \n Rate: 69/-");
                       proNAME[n]="Apsara Pencil";
                       proBP[n]=69;
                       System.out.println("How many 'Apsara Pencil' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*69);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 715 : System.out.println("OilPaint \n Rate: 30/-");
                       proNAME[n]="OilPaint";
                       proBP[n]=30;
                       System.out.println("How many 'OilPaint' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*30);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 716 : System.out.println("Scientific Calculator \n Rate: 1199/-");
                       proNAME[n]="Scientific Calculator";
                       proBP[n]=1199;
                       System.out.println("How many 'Scientific Calculator' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*1199);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 717 : System.out.println(" Document File \n Rate: 10/-");
                       proNAME[n]="Document file";
                       proBP[n]=10;
                       System.out.println("How many 'Document File' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*10);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 718 : System.out.println("Stappler \n Rate: 85/-");
                       proNAME[n]="Stappler";
                       proBP[n]=85;
                       System.out.println("How many 'Stappler' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*85);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 719 : System.out.println("Geometry Set \n Rate: 250/-");
                       proNAME[n]="Geometry Set";
                       proBP[n]=250;
                       System.out.println("How many 'Geometry Set' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*250);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 720 : System.out.println("Drawing Book \n Rate: 60/-");
                       proNAME[n]="Drawing Book";
                       proBP[n]=60;
                       System.out.println("How many 'Drawing Book' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*60);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 
                       
            default : System.out.println("enter valid product code ");
                     
        }

        System.out.println("Do you want to add more products in your cart? \n1.YES    2.NO");
        x=sc.nextInt();

    }while(x!=2);
}

}

class GROCERY extends BASE{
    Scanner sc=new Scanner(System.in);
    int QUANTITY;
    int sump=0;
    int code,x;
    void order()
    {
        do{
        System.out.println("\n");
        System.out.print("ENTER YOUR PRODUCT CODE: ");
        code=sc.nextInt();
        switch(code)
        {
            case 811 : System.out.println("Brown Bread \n Rate: 30/-");
                       proNAME[n]="Brown Bread";
                       proBP[n]=30;
                       System.out.println("How many 'Brown Bread' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*30);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 812 :  System.out.println("Peanut Butter (1 KG) \n Rate: 399/-");
                        proNAME[n]="Peanut Butter (1 KG)";
                        proBP[n]=399;
                        System.out.println("How many 'Peanut Butter (1 KG)'' are you adding to your cart? (QUANTITY)");
                        QUANTITY=sc.nextInt();
                        proQY[n]=QUANTITY;
                        sump=(QUANTITY*399);
                        proTP[n]=sump;
                        sum=sum+sump;
                        n++;
                        System.out.println("\n");
                        break;    

            case 813 : System.out.println("Toast \n Rate: 50/-");
                       proNAME[n]="Toast";
                       proBP[n]=50;
                       System.out.println("How many 'Toast' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*50);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break; 

            case 814 : System.out.println("Biscuit \n Rate: 95/-");
                       proNAME[n]="Biscuit";
                       proBP[n]=95;
                       System.out.println("How many 'Biscuit' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*95);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 815 : System.out.println("Milk \n Rate: 51/-");
                       proNAME[n]="Milk";
                       proBP[n]=51;
                       System.out.println("How many 'Milk' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*51);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 816 : System.out.println("Salt \n Rate: 21/-");
                       proNAME[n]="Salt";
                       proBP[n]=21;
                       System.out.println("How many 'Salt' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*21);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 817 : System.out.println("Sunflower Oil (1 Lt) \n Rate: 129/-");
                       proNAME[n]="Sunflower Oil (1 lt)";
                       proBP[n]=129;
                       System.out.println("How many 'Sunflower Oil (1 lt)' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*129);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 818 : System.out.println("Poha (1 KG) \n Rate: 37/-");
                       proNAME[n]="Poha (1 KG)";
                       proBP[n]=37;
                       System.out.println("How many 'Poha (1 KG)' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*37);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 819 : System.out.println("Ghee (1 Lt) \n Rate: 500/-");
                       proNAME[n]="Ghee (1 Lt)";
                       proBP[n]=500;
                       System.out.println("How many 'Ghee (1 Ltr)' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*500);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

            case 820 : System.out.println("Masala \n Rate: 60/-");
                       proNAME[n]="Masala";
                       proBP[n]=60;
                       System.out.println("How many 'Masala' are you adding to your cart? (QUANTITY)");
                       QUANTITY=sc.nextInt();
                       proQY[n]=QUANTITY;
                       sump=(QUANTITY*60);
                       proTP[n]=sump;
                       sum=sum+sump;
                       n++;
                       System.out.println("\n");
                       break;

                       
                       
            default : System.out.println("enter valid product code ");
                     
        }

        System.out.println("Do you want to add more products in your cart? \n1.YES    2.NO");
        x=sc.nextInt();

    }while(x!=2);
}

}
 
class BILL extends BASE{                                //this class will create customer's final bill
    int TOTAL=0;
    int [] productTP=proTP;    //TP : Total price
    int [] productQY=proQY;    //QY : Quantity
    int [] productBP=proBP;    //BP : base price
    String [] productNAME=proNAME;
    int TNOP=n;    //TNOP : total no of products
    int OrderSum=sum;   //overall sum

    int ToQuantity()               // this will give total number of items taken
    {
         for(int i=0;i<TNOP;i++)
         {
            TOTAL= TOTAL+productQY[i];     //productQY[i] will give how much quantity of each product is taken 
         }
          
        return TOTAL;

    }
    
   public void PRINTBILL(){             // bill print funtion
        System.out.println("\n");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Your order invoice : ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("\n");
        
        for(int i=0; i<TNOP;i++)
        {
         
         System.out.println("Product "+(i+1));
         System.out.println("Name: "+productNAME[i]);
         System.out.println("Quantity: "+productQY[i]+   "          Base Price: "+productBP[i]+"          Amount: "+productTP[i]);
         System.out.println();
        
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Total items: "+TNOP+ "          Total Qty: "+ToQuantity()+ "          Total Bill Amount: "+OrderSum+"/-");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Thank you for shopping with us\n    Eager to see you again \n            (-_-)");
    }
}

class OPERATION {
    Scanner sc=new Scanner(System.in);
    int m,p;    // m-category number
    void shop()
    {   
        do{
        System.out.println();
        System.out.println("Please choose a category \n 1. ELECTRONICS \n 2. FASHION \n 3. STATIONARY \n 4. GROCERY \n");
        m=sc.nextInt();
        if(m==1)
        {
            ELECTRONICS E1=new ELECTRONICS();
            E1.order();
        }
        else if(m==2)
        {
            FASHION F1=new FASHION();
            F1.order();
        }
        else if(m==3)
        {
            STATIONARY S1=new STATIONARY();
            S1.order();
        }
        else if(m==4)
        {
            GROCERY G1=new GROCERY();
            G1.order();
        }
        else
        {
            System.out.println("please choose valid category");
        }
        
        System.out.println("do you want to continue adding products from another category? \n 1. YES   2. NO");
        p=sc.nextInt();

    }while(p!=2);

    BILL B1=new BILL();
    B1.PRINTBILL();
}
}



public class InvoiceGenerator {
    public static void main(String[] args) {
        System.out.println("\n\n");
        System.out.println("\t \t \t WELCOME TO GenTech Store ");
        System.out.println("\n \n \n ");
        OPERATION O1 = new OPERATION();
        O1.shop();
    }
}
