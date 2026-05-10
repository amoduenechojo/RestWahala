//public class MyArrayList {
//
//    private String[] element = new String[10];
//    private int count = 0;
//
//
//    public boolean isEmpty() {
//        return count == 0;
//    }
//
//    public int sizeOfList() {
//        return count;
//    }
//
//    public boolean add(String value) {
//        if(count == element.length){
//            return false;
//        }
//
//            element[count] = value;
//            count ++;
//        return true;
//    }
//
//    public String getList(int index) {
//        if (index < 0 || index >= count) {
//            throw new IndexOutOfBoundsException();
//        }
//
//        return element[index];
//    }
//
//    public boolean contains(String value) {
//
//        for(int index = 0; index < count; index++) {
//            if (element[index].equals(value)) {
//                return true;
//            }
//        }
//    return false;
//    }
//
//    public String remove(int index) {
//
//        if (index < 0 || index >= count) {
//            return null;
//        }
//
//        String removed = element[index];
//
//        for (int index = count; index < count - 1; index++) {
//            element[index] = element[index + 1];
//        }
//
//        count--;
//
//        return removed;
//    }
//
//
//    public void clear() {
//         count = 0;
//    }
//
//    public String setList(int index, String value) {
//
//        String oldValue =  element[index];
//
//        element[index] = value;
//        return oldValue;
//    }
//
//
//}
