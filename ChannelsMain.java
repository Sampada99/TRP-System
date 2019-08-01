package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


	public class ChannelsMain {
		public static void main(String[] args) {
			
			int ch = 0;
			int id,ix,cost=0,n,d=0,flag=0,k,j=0;
			double discount;
			double amount;
			Scanner sc = new Scanner(System.in);
			
			ArrayList<Channels> a = new ArrayList<Channels>();
			
			a.add(new Channels(101,"Zeee TVXX",4,35));
			a.add(new Channels(102,"Star Plus",6,40));
			a.add(new Channels(103,"Sony TVXX",7,42));
			a.add(new Channels(104,"Colourss ",5,32));
			a.add(new Channels(105,"Discovery",2,25));
			
			Collections.sort(a,new Channels());
			System.out.println("Id   Name    Rank  Cost");

			for(Channels i:a) {
				System.out.println(i.toString());
			}
			
			System.out.println("Enter all the channels to create your pack!");
			
			String w;
			do {
					System.out.println("Enter the no of channels to create your pack");
					n=sc.nextInt();
					if(n<6)
					{
							while(j<n)
							{
									System.out.println("Enter the channel id of the channel to be added to your pack: ");
									id=sc.nextInt();
									flag=0;
									for(k=0;k<5;k++) {
										if(id==a.get(k).getChannel_id()) {
											flag=1;
											break;
										}
									}
									if(flag==1)
									{
												if(id==a.get(k).getChannel_id()) 
												{
														cost=cost+a.get(k).getChannel_cost();
														System.out.println("cost"+cost);
														int cou = a.get(k).getTrp_count();
														cou+=1;
														a.get(k).setTrp_count(cou);
														j+=1;
						
												}
									}
									else
									{
											System.out.println("enter valid choice!");
											
									}
							}
							if(n<=2)
							{
									discount=cost;
									System.out.println("No Discount and amount is: "+discount);
							}
							else if(n==3 || n==4 )
							{
									discount=cost-cost*0.05;
									System.out.println("discounted amount is "+discount);
							}
							else
							{
									discount=cost-0.1*cost;
									System.out.println("discounted amount is "+discount);
							}
							System.out.println("enter amount to be paid");
							amount=sc.nextDouble();
							while(amount!=discount)
							{	
									System.out.println("error:enter valid amount reenter");
									amount=sc.nextDouble();
							}
							System.out.println("Successfull !!");
							Collections.sort(a,new Channels());
							System.out.println("Id   Name    Rank  Cost");
							for(Channels i:a)
							{
									System.out.println(i.toString());
							}			
					}
					else
					{
							System.out.println("Channel range out of bound");
					}
					System.out.println("Do u want to continue(1=yes and 0=no)");
					ch =sc.nextInt();
				}while(ch!=0);
				System.out.println("Thank you!");
		}
}