package DesignPatterns.Adapter;

public class TableContactManager implements TableData {
    ContactManager contactManager;

    public TableContactManager(ContactManager contactManager) {
        this.contactManager = contactManager;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return contactManager.getContactCount();
    }

    @Override
    public int getColumnSpacing() {
        return 3;
    }

    @Override
    public int getRowSpacing() {
        return 0;
    }

    @Override
    public char getHeaderUnderline() {
        return '-';
    }

    @Override
    public String getColumnHeader(int col) {
        switch (col){
            case 0:
                return "First Name";
            case 1:
                return "Last Name";
            case 2:
                return "Phone";
            case 3:
                return "E-mail";
            default:
                return null;
        }
    }

    @Override
    public int getColumnWidth(int col) {
        switch(col){
            case 0:
                return 11;
            case 1:
                return 12;
            case 2:
                return 14;
            case 3:
                return 16;
            default:
                return 0;
        }
    }

    @Override
    public Justification getColumnJustification(int col) {
        return Justification.Center;
    }

    @Override
    public String getCellValue(int row, int col) {
        Contact contact = contactManager.getContact(row);

        switch (col) {
            case 0:
                return contact.getFirstName();
            case 1:
                return contact.getLastName();
            case 2:
                return contact.getPhone();
            case 3:
                return contact.getEmail();
            default:
                return null;
        }
    }
}
