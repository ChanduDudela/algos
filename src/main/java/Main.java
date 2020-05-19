public class Main {
  public static void main(String[] args) {
    LinkedList l1 = new LinkedList(1);
    l1.append(2);
    l1.append(3);
    l1.append(5);
    l1.append(4);
    l1.append(5);

    l1.deleteWithValue(5);
    l1.prepend(0);

    System.out.println(l1.toString());
  }
}
