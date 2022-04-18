package Lec_15;

public class TestAppMy {
    public static void main(String[] args) {
        // reference type array
        Book[] books = new Book[3];
//        // in ram there is an object created.
//        books[0] = new Book(1,"Intro to Java");
//        books[1] = new Book(2,"Intro to web");
//        books[2] = new Book(3,"Intro to DS");
//
//        // iterate an array
//        for (int i = 0; i <books.length ; i++) {
//            System.out.println(books[i].getTitle());
//
//        }

        // Books initilizaion through loop.

//        Book books1[] = new Book[3];
//        for (int i = 0; i < books1.length; i++) {
//            books1[i] = new Book(i+1, + (i+1));
//
//        }
//        // iterate an array
////        for (int i = 0; i <books.length ; i++) {
////            System.out.println(books[i].getTitle());
////
////        }

        // you can do it like this
//        Book book1 = new Book(1,"Intro to MANAGEMENT");
//        books[3] = book1;

        // you can initilize reference type data as well.
     /*   Book book1 = new Book(1,"Intro to Java");
        Book book2 = new Book(2,"Intro to web");
        Book book3 = new Book(3,"Intro to DS");

        Book[] booksr = new Book[] {book1,book2,book3};

        // you can write above code like this as well
        Book[] booksrN = new Book[] {new Book(1,"Intro to Java"),
                new Book(2,"Intro to web"),
                new Book(3,"Intro to DS")};
*/

        // enhanced for loop
//        for (int n : nums){
//            System.out.println(n);
//        }

        for (Book book : books) {
            System.out.println(book.getTitle());
        }


    }
}

/*
ctrl +alt l for formatting of code
 Java arrays: are ordered collection of primitive or objcet reference type

 java arrays are homogenous - all element of an array must be of the same type.

 Three types to create an array
 1) Declarition
 2) instantiation
 3) initialization
 // premitive types

        // 1. declarition
        int nums [];// you can put bracket before like int [] nums;

        // 2. instantiate
        nums = new int[3];

        // you can write at once
      //  int [] nums2 = new int[3];

  // methods  1 .. nums = new int {2,4,6};
   // methods 2:
    nums [0] = 2;
    nums [1] = 4;
    nums [2] = 6;

    methods 3
     for (int i = 0; i < nums.length ; i++) {
     nums[i] = i + 1;


     Reference type and primitive type array diff
      Primitive types arrays:in every element there is an value.
     reference type: inplace value there is an reference  mean address of an objects




        }


 */
