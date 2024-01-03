

In java Collections

Collections Framework is a set of built in data Structure(like STL in CPP)

Hierarchy
 I ---> denotes InterFace
 C ---> denotes Class
 Below mentioned all classes and Interface are generic
   Collection<E> --- its a generic Intergace which is at top root
   Child interface of collection are Set(I),Queue(I),List(I) --> remember as SQL
   List(I) --> Vector(C),ArrayList(C),LinkedList(C)
               Vector(C) --> child class is Stack(C)  //legacy which is 1.0 initial version of java(JDK 1.0)

   Queue(I) --> Deque(I),BlockingQueue(C),PriorityQueue(C)
                BlockingQueue(C) --> two child class LinkedBlockingQueue(C),PriorityBlockingQueue(C)


   Set(I) --> HashSet(C),SortedSet(I)
              HashSet(C) -- > LinkedHashSet(C)
                              SortedSet(I) --> NavigableSet(I) --> TreeSet(C)


   Note -- map is not part of collection hirarchy
   Map<K,V>(I) --> HashMap(C),WeakHashMap(C),HashTable(C),IdentityHashMap(C),SortedMap(I)

                   HashMap(C) --> LinkedHashMap(C)

                   HashTable(C) --> Properties(C)  Note - HashTable also extends Dictionary(AC--Abstract Class)

                   SortedMap(I) --> NavigableMap(I) --> TreeMap(C)

