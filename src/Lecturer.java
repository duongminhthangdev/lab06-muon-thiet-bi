
public class Lecturer implements IBorrower{
    private int toiDa;
    @Override
       public String getBorrowerId() {
            return "GV01";
        }

        @Override
        public String getFullName() {
            return "Nguyen Van A";
        }

        @Override
        public int getMaximumDevices() {
            return 5;
        }
}

