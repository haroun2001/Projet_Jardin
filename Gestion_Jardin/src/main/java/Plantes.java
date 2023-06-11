
abstract class Plantes implements Interfaces_Test {
private Float tailleMax_cm_;
   public java.util.Collection<Interfaces_Test> interfaceTest;
   abstract boolean necessiteEau();
   /** @pdOid 3dc4af7a-f680-45c3-94b1-7b1a8aa1880c */
   abstract boolean resitanteOmbre();   
   public java.util.Collection<Interfaces_Test> getInterfaces_Test() {
      if (interfaceTest == null)
         interfaceTest = new java.util.HashSet<>();
      return interfaceTest;
   }
   public java.util.Iterator getIteratorInterfaceTest() {
      if (interfaceTest == null)
         interfaceTest = new java.util.HashSet<>();
      return interfaceTest.iterator();
   }
   public void setInterfaceTest(java.util.Collection<Interfaces_Test> newInterfaceTest) {
      removeAllInterfaceTest();
      for (java.util.Iterator iter = newInterfaceTest.iterator(); iter.hasNext();)
         addInterfaceTest((Interfaces_Test)iter.next());
   }
   public void addInterfaceTest(Interfaces_Test newInterfaceTest) {
      if (newInterfaceTest == null)
         return;
      if (this.interfaceTest == null)
         this.interfaceTest = new java.util.HashSet<>();
      if (!this.interfaceTest.contains(newInterfaceTest))
         this.interfaceTest.add(newInterfaceTest);
   }
   public void removeInterfaceTest(Interfaces_Test oldInterfaceTest) {
      if (oldInterfaceTest == null)
         return;
      if (this.interfaceTest != null)
         if (this.interfaceTest.contains(oldInterfaceTest))
            this.interfaceTest.remove(oldInterfaceTest);
   }
   public void removeAllInterfaceTest() {
      if (interfaceTest != null)
         interfaceTest.clear();
   }

}
