
    import java.util.*;
    /**
     * SectionB represents fields and methods used to test the Section B
     * students on the SYSC 2004 midterm.
     *
     * @author Your Prof and you
     * @version 1.0
     */
    public class SectionB<Animal> { // 3 marks for fields (1 mark each, no part marks)

        private Random r;  // random number generator
        private Animal[] animalArray;  // array of Animals
        private int count; // number of elements currently in array
        public static final int SIZE = 4; // length of array
        private LinkedList<Animal> animalLinkedList;  // LinkedList of Animals

        /**
         * Constructor for objects of class SectionB.
         * The array and LinkedList will start out empty.
         */
        public SectionB() { // 5 marks
            this.r = new Random();
            this.animalArray = new Animal[SIZE];
            this.animalLinkedList = new LinkedList<Animal>();
            this.count = 0;
        }

        /**
         * addInArray adds an animal at the index of the array specified,
         * unless the array is full or the index is invalid.
         * The index is invalid if it is less than zero, or greater than the
         * number of elements currently stored in the array.
         * If the animal can be added, any existing array elements at the
         * given index or higher will be moved over.
         * Note that no error checking of the species and weight parameters is
         * needed.
         *
         * @param species String species of animal to add
         * @param weight double weight of animal to add
         * @param  index int index where animal is to be added
         *
         * @return true if successful, false otherwise (array full or index
         * invalid).
         */ // 9 marks
        public boolean addInArray (String species, double weight, int index) {
            if (count == 0 || index > SIZE || index < 0) {
                return false;
            }
            for (int i = count; i > index; i--) {
                animalArray[i] = animalArray[i - 1];
            }
            animalArray[index] = new Animal(species, weight);
            count++;
            return true;
        }




        /**
         * addLinkedList adds an animal at the *end* of the LinkedList.
         * Note that no error checking of the parameters is needed.
         *
         * @param species, String species of animal to add
         * @param weight, double weight of animal to add
         */ // 4 marks
        public void addLinkedList (String species, double weight) {
            animalLinkedList.addLast(new Animal(species, weight));
        }


        /**
         * randomEvenNumber returns a pseudo random even integer between 0
         * and value, inclusive (i.e. a value in the range: 0, 2, 4, ... ,
         * value, if value is even; or 0, 2, 4, ..., value-1, if value is odd)
         * If value is less than 2, value is replaced with 2.
         *
         * @param value, int: the end of the range
         *
         * @return  an even integer between 0 and value, inclusive
         */ // 5 marks
        public int randomEvenNumber (int value) {
            if (value < 2) {
/*            } else if (value % 2 == 0) {
                return r.nextInt(value) * 2;
            }
            return r.nextInt((value - 1)) * 2;*/
            value = 2;
            }
            return r.nextInt(value/2 + 1) * 2;
        }


        /**
         * printLinkedList uses a for-each loop to print out the LinkedList,
         * one Animal per line, using format: "<species> weighs <weight>kgs."
         * If the LinkedList is empty, it prints an appropriate message.
         */ // 5 marks
        public void printLinkedList () {
            if (animalLinkedList.size() == 0 || animalLinkedList == null) {
                System.out.println("Not valid");
            }

            for (Animal a: animalLinkedList) {
                System.out.println(a.disPlayString());
            }
        }



        /**
         * removeWeight uses an Iterator to remove all Animals with a weight
         * within 2kgs (inclusive) of the given weight.
         * For example, if the weight specified was 2.5, then all animals
         * weighing from 0.5kgs to 4.5kgs would be removed.
         *
         * @param weight, double weight in kgs
         */ // 6 marks
        public void removeWeight (double weight) {
            Iterator<Animal> iter = animalLinkedList.iterator();

            while (iter.hasNext()) {
                //if (iter.next().weight()  <= weight + 2 || iter.next().weight() >= weight - 2) {
                if (Math.abs(iter.next().weight()-weight)<=2){
                    iter.remove();
                }
            }
        }


    }
