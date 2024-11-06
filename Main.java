import java.util.*;

import javax.lang.model.util.ElementScanner6;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    String data;


    System.out.println("Welcome to: What continent should you live on/visit");

    System.out.println("Can you stand the heat? (yes, no, love it!, heck no!)");
    data = scan.nextLine();
    switch(data)
  {
    case "yes":
       System.out.println("You should live near the equator");
       System.out.println("How do you feel about wildlife? (stay away, they are all so cute, meh)");
       data = scan.nextLine();
       switch(data)
       {
         case "stay away":
            System.out.println("You should live in Asia!");
            break;
          case "they are all so cute":
            System.out.println("You should live in Africa!");
            break;
          case "meh":
            System.out.println("You should live in South America!");
            break;
       }
       break;
    case "no":
      System.out.println("You should live somewhere that sits just above the equator");
      System.out.println("Are you attached to the Pacific Ocean? (yes/no)");
      data = scan.nextLine();
      if(data.equals("yes"))
      {
        System.out.println("How do you feel about wildlife? (stay away/meh)");
        data = scan.nextLine();
        if(data.equals("meh"))
        {
          System.out.println("You should live in North America!");
        }
        else 
        {
          System.out.println("You should live in Asia!");
        }

      }
      else 
      {
        System.out.println("Do you like curry or stew better? (curry/stew)");
        data = scan.nextLine();
        if(data.equals("curry"))
        {
          System.out.println("You should live in Africa!");
        }
        else 
        {
          System.out.println("You should live in Europe!");
        }
      }
      break;
    case "love it!":
      System.out.println("You should live somewhere south of the equator");
      System.out.println("Do you like civilization? (yes please/no");
      data = scan.nextLine();
      if(data.equals("yes please"))
      {
        System.out.println("You should live in Africa!");
      }
      else 
      {
        System.out.println("Which dish do you like more? (Chicken parmigiana/corn");
        data = scan.nextLine();
        if(data.equals("corn"))
        {
          System.out.println("You should live in South America!");
        }
        else 
        {
          System.out.println("You should live in Australia!");
        }
      }
      break;
    case "heck no!":
      System.out.println("You should live near one of the poles");
      System.out.println("Do like civilization? (yes please/no)");
      data = scan.nextLine();
      if(data.equals("yes please"))
    {
    System.out.println("How do you feel about wildlife? (stay away, meh");
    data = scan.nextLine();
    switch(data)
    {
      case "stay away":
        System.out.println("You should live in northern Asia!");
        break;
      case "meh":
        System.out.println("You should live in nothern North America!");
        break;
    }
  }
  else 
  {
    System.out.println("You should live in Antarctica!");
    break;
  }
    default:
      System.out.println("Answer with one of the given choices please.");
      break;
  }
  }
}