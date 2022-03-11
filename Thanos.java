import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        System.out.println("// TODO 1 : Create an empty heroes list");

        ArrayList<Hero> heros = new ArrayList<>();
        System.out.println(heros);
                        

        // TODO 2 : Add those heroes to the list
        System.out.println("// TODO 2 : Add those heroes to the list");

        // name: Black Widow, age: 34
        Hero blackwidow = new Hero ("Black Widow", 34);
        heros.add(blackwidow);

        // name: Captain America, age: 100
        Hero captainamerica = new Hero ("Captain America", 100);
        heros.add(captainamerica);

        // name: Vision, age: 3
        Hero vision = new Hero ("Vision", 3);
        heros.add(vision);
        
        // name: Iron Man, age: 48
        Hero ironman = new Hero ("Iron Man", 48);
        heros.add(ironman);
        
        // name: Scarlet Witch, age: 29
        Hero scarletwitch = new Hero ("Scarlet Witch", 29);
        heros.add(scarletwitch);
        
        // name: Thor, age: 1500
        Hero thor = new Hero ("Thor", 1500);
        heros.add(thor);
        
        // name: Hulk, age: 49
        Hero hulk = new Hero ("Hulk", 49);
        heros.add(hulk);
        
        // name: Doctor Strange, age: 42
        Hero doctorstrange = new Hero ("Doctor Strange", 42);
        heros.add(doctorstrange);

        System.out.println(heros);

        for (int i = 0; i < heros.size(); i++){
            
            System.out.println(heros.get(i).getName() + " " + heros.get(i).getAge());
              
        }
    

        // TODO 3 : It's Thor birthday, now he's 1501
        System.out.println("// TODO 3 : It's Thor birthday, now he's 1501");

        thor.setAge(1501);
    
        for (int i = 0; i < heros.size(); i++){
            
            System.out.println(heros.get(i).getName() + " " + heros.get(i).getAge());
              
        }


        // TODO 4 : Shuffle the heroes list
        System.out.println("// TODO 4 : Shuffle the heroes list");

        Collections.shuffle(heros);

        for (int i = 0; i < heros.size(); i++){
            
            System.out.println(heros.get(i).getName() + " " + heros.get(i).getAge());
              
        }


        // TODO 5 : Keep only the half of the list
        System.out.println("// TODO 5 : Keep only the half of the list");
        

        int herosSize = heros.size();
        // Test System.out.println(herosSize); // Test
        for (int i = 0; i < (herosSize/2); i++){
            heros.remove(i);
        // Test    System.out.println("i=" + i ); // Test
        }

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        System.out.println("// TODO 6 : Loop throught the list and display the name of the remaining heroes");

            for (int i = 0; i < heros.size(); i++){
            
                System.out.println(heros.get(i).getName() + " " + heros.get(i).getAge());
                  
            }

           
    }

    
}
