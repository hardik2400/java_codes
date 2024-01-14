public class pattern {
     
        public static void main(String[] args) {
    
            //Pattern 46		
            //1
            //23
            //345
            //4567
            //56789
            
                        
            for(int i=1;i<=5;i++)//1 2 3 4<=5
            {
                //i=4
                int k = i ;//k=4
                for(int j=1;j<=i;j++)// 1<=4
                    System.out.print(k++);//4567
                                                
                System.out.println();
            }
    
            //Pattern 47		
            //1  2  3  4  5
            //6  7  8  9
            //10 11 12
            //13 14
            //15
    
            /*
            int k=1;	
            for(int i=5;i>=1;i--)//5 4 3>=1
            {
                //i=3
                for(int j=1;j<=i;j++)// 1 2 3<= 3
                {
                    if(k>=10)// 12 >=10
                    {
                        if(j==i)//1 2 3== 3
                            System.out.print(k++);//12
                        else
                            System.out.print(k++ +" ");//10 11 
                    }
                    else
                    {
                        if(j==i)//1 2 3 4 == 4
                            System.out.print(k++);//
                        else
                            System.out.print(k++ +"  ");//6  7  8  9
                        
                    }
                    //k=13
                }
                                                
                System.out.println();
            }
            */
            
            //Pattern 48
            
            //1234
            //2341
            //3421
            //4321
                        
            /*for(int i=1;i<=4;i++)//1 2 3<= 4
            {
                //i=3
                
                for(int j=i;j<=4;j++)// 3 <= 4
                    System.out.print(j);//34
                
                for(int j=i-1;j>=1;j--)// 2 >= 1
                    System.out.print(j);//21
                
                System.out.println();
            }*/
            
            //Pattern 49
            
            //11111
            //0000
            //111
            //00
            //1
    
                        
            /*for(int i=5;i>=1;i--)//5 4
            {
                //i=4
                if(i%2==0)//4%2 0==0
                {
                    for(int j=1;j<=i;j++)// 1 <= 4
                        System.out.print("0");//0000
                }
                else
                {
                    for(int j=1;j<=i;j++)// 1 <= 5
                        System.out.print("1");//11111
                }
                System.out.println();
            }*/		
            
            //Pattern 50
            
            //1  
            //4   9  16 
            //25  36  49  64  81 
            //100 121 144 169 196 225 256 
            //289 324 361 400 441 484 529 576 625
    
            
            /*int k=1;
            for(int i=1;i<=9;i+=2)//1 3 5 7 9
            {
                //i=3
                for(int j=1;j<=i;j++)// 1 2 3<= 3
                {
                    if( k*k >= 100)// 4 9 16>= 10
                    {
                        if(j==i)//1 2 3 == 3
                            System.out.print(k*k);//16
                        else
                        {
                            System.out.print(k*k+" ");//4   9
                        }
                    }
                    else if( k*k >= 10)// 4 9 16>= 10
                    {
                        if(j==i)//1 2 3 == 3
                            System.out.print(k*k);//16
                        else
                        {
                            System.out.print(k*k+"  ");//4   9
                        }
                    }
                    else
                    {
                        if(j==i)//1 2 == 3
                            System.out.print(k*k);//1
                        else
                        {
                            if( (k+1)*(k+1)>=10 )//16>=10
                                System.out.print(k*k+"  ");//4   9   
                            else
                                System.out.print(k*k+"   ");//4   9
                        }
                    }
                    
                    k++;//3++
                    //k=4
                }
                
                System.out.println();
            }*/
            
            
            //Pattern 51
            //11111
            //1   1
            //1   1
            //1   1
            //11111
            
    
            /*for(int i=1;i<=5;i++)// 1 2 <=5
            {
                //i=2
                if(i==1 || i==5)
                {
                    for(int j=1;j<=5;j++)// 1 <= 5
                        System.out.print("1");//11111
                }
                else
                {
                    for(int j=1;j<=5;j++)// 1 2 3 4 5<= 5
                    {
                        if(j==1 || j==5)//5==1 || 5==5
                            System.out.print("1");//1
                        else
                            System.out.print(" ");//---
                    }
                }
                System.out.println();
            }*/
    
            
            //Pattern 52
            //    1 
            //   1 2 
            //  1 2 3 
            // 1 2 3 4 
            //1 2 3 4 5
    
            
    
            /*for(int i=1;i<=5;i++)//1 2 3
            {
                //i=3
                //Space				
                for(int j=i;j<5;j++)// 3<5
                    System.out.print(" ");//--
                
                for(int j=1;j<=i;j++)// 1 2 3<= 3
                {
                    if(j==i)//3==3
                        System.out.print(j);//*
                    else
                        System.out.print(j+" ");//* * 
                }
        
                
                System.out.println();
            }*/
    
            
            
            //Pattern 53
            //    1
            //   123
            //  12345
            // 1234567
            //123456789
            // 1234567
            //  12345
            //   123
            //    1
    
            /*for(int i=1;i<=5;i++)//1 2 3 4 5 
            {
                //i=1
                //Space				
                for(int j=i;j<5;j++)//1<5 
                    System.out.print(" ");//----
                
                for(int j=1;j<= i*2 -1;j++)// 
                    System.out.print(j);//* * 
                            
                System.out.println();
            }
            
            for(int i=4;i>=1;i--)//1 2 3 4 5 
            {
                //i=1
                //Space				
                for(int j=i;j<5;j++)//1<5 
                    System.out.print(" ");//----
                
                for(int j=1;j<= i*2 -1;j++)// 
                    System.out.print(j);//* * 
                            
                System.out.println();
            }*/
            
            
            
            
        }
    }
    

