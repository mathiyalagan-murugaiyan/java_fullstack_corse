class Account {

          int acNo;
          String name;
          int mobilNo;
          double acBalance ;
          double lgBalance;
          String ifsc;
          String branch;
          double amount;
          double currentBalance;


          Account(int acNo,String name,Double acBalance){
           
             this.acNo = acNo;
             this.name = name;
             this.acBalance=acBalance;
          }

          Account(int acNo,int mobilNo,double acBalance,String ifsc){

             this.acNo = acNo;
             this.mobilNo = mobilNo;
             this.acBalance = acBalance;
             this.ifsc = ifsc;
          }

          Account(int acNo,String name,int mobilNo,double acBalance,double lgBalance,String ifsc,String branch,Double amount){

             this.acNo = acNo;
             this.name = name;
             this.mobilNo=mobilNo;
             this.acBalance = acBalance;
             
             this.ifsc = ifsc;
             this.branch = branch;
             this.amount = amount;

          }


          void deposit(double amount){

            currentBalance = acBalance + amount;

             System.out.println("DEPOSIT");

             System.out.println("***********************************");

             System.out.println("your money deposite successfully");

             System.out.println("Balance =" + currentBalance );

             System.out.println("***********************************");

          }

         void withdrow(double amount){
           
                  if(acBalance >= amount){

                     System.out.println("WITHDROW");

                     System.out.println("***********************************");

                  	System.out.println("Please take your amount");

                  	 currentBalance = currentBalance - amount;

                  	System.out.println("Your Current Balance is =" + currentBalance);

                     System.out.println("***********************************");
                  }
                  else 

                  	System.out.println("Sorry Insufficient Balance");

         }
         

         void balanceEnquiry(){

             System.out.println("BALANCE ENQUIRY");

             System.out.println("***********************************");

             System.out.println(" Account No :" + acNo);

             System.out.println(" Name :" + name);

             System.out.println( " Balance :" + currentBalance );

             System.out.println("***********************************");

         }

          void intrest(int amount ,int rateOfIntrest,int time){

            System.out.println("INTREST");

            System.out.println("***********************************");
           
              double in = (amount*rateOfIntrest*time)/100;

             System.out.println("Intrest amount is =" + in);


            System.out.println("***********************************"); 
            
          }

}

class Bank{


     public static void main (String args[]){


     	Account c1 = new Account(12345,"mathi",5000.0);

     	c1.deposit(1000.0);  // passing one int arrgument

      c1.withdrow(2000.0);  // passing one int arrgument

      c1.balanceEnquiry();  //zero arrgument

      c1.intrest(1000,5,8);   // passing three int arrgument

     }




}