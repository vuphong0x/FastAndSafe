package com.teamone.fastandsafe.database;

public class ConstantKey {

    public final static String COLUMN_ID = "ID";

    //=======================| Employees Model |=======================
    public final static String EMPLOYEE_TABLE_NAME = "employees_table";
    public final static String EMPLOYEE_USER_NAME = "employees_username";
    public final static String EMPLOYEE_PASSWORD = "employees_password";
    public final static String EMPLOYEE_NAME = "employees_name";
    public final static String EMPLOYEE_ADDRESS = "employees_address";
    public final static String EMPLOYEE_PHONE_NUMBER = "employees_phone_number";
    public final static String EMPLOYEE_DATE_OF_BIRTH = "employees_date_of_birth";
    public final static String EMPLOYEE_PERMISSION = "employees_permission";

    protected final static String CREATE_EMPLOYEES_TABLE = "CREATE TABLE " + EMPLOYEE_TABLE_NAME + " ("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + EMPLOYEE_USER_NAME + " TEXT, "
            + EMPLOYEE_PASSWORD + " TEXT, "
            + EMPLOYEE_NAME + " TEXT, "
            + EMPLOYEE_ADDRESS + " TEXT, "
            + EMPLOYEE_PHONE_NUMBER + " TEXT, "
            + EMPLOYEE_DATE_OF_BIRTH + " TEXT, "
            + EMPLOYEE_PERMISSION + " TEXT ) ";

    protected final static String DROP_EMPLOYEE_TABLE = "DROP TABLE IF EXISTS " + EMPLOYEE_TABLE_NAME + " ";
    public final static String SELECT_EMPLOYEE_TABLE = "SELECT * FROM " + EMPLOYEE_TABLE_NAME;


    //=======================| Products Model |=======================
    public final static String PRODUCT_TABLE_NAME = "product_table";
    public final static String PRODUCT_NAME = "product_name";
    public final static String PRODUCT_CATEGORY = "product_category";
    public final static String PRODUCT_SUPPLIER = "product_supplier";
    public final static String PRODUCT_PRICE = "product_price";

    protected final static String CREATE_PRODUCT_TABLE = "CREATE TABLE " + PRODUCT_TABLE_NAME
            + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PRODUCT_NAME + " TEXT, "
            + PRODUCT_CATEGORY + " TEXT, "
            + PRODUCT_SUPPLIER + " TEXT, "
            + PRODUCT_PRICE + " TEXT ) ";

    protected final static String DROP_PRODUCT_TABLE = "DROP TABLE IF EXISTS " + PRODUCT_TABLE_NAME + " ";
    public final static String SELECT_PRODUCT_TABLE = "SELECT * FROM " + PRODUCT_TABLE_NAME;


    //=======================| Customers Model |=======================
    public final static String CUSTOMER_TABLE_NAME = "customer_table";
    public final static String CUSTOMER_NAME = "customer_name";
    public final static String CUSTOMER_PHONE_NUMBER = "customer_phone_number";
    public final static String CUSTOMER_EMAIL = "customer_email";
    public final static String CUSTOMER_ADDRESS = "customer_address";

    protected final static String CREATE_CUSTOMER_TABLE = "CREATE TABLE " + CUSTOMER_TABLE_NAME
            + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CUSTOMER_NAME + " TEXT, "
            + CUSTOMER_PHONE_NUMBER + " TEXT, "
            + CUSTOMER_EMAIL + " TEXT, "
            + CUSTOMER_ADDRESS + " TEXT ) ";

    protected final static String DROP_CUSTOMER_TABLE = "DROP TABLE IF EXISTS " + CUSTOMER_TABLE_NAME + " ";
    public final static String SELECT_CUSTOMER_TABLE = "SELECT * FROM " + CUSTOMER_TABLE_NAME;


    //=======================| Orders Model |=======================
    public final static String ORDER_TABLE_NAME = "order_table";
    public final static String ORDER_DATE = "order_date";

    protected final static String CREATE_ORDER_TABLE = "CREATE TABLE " + ORDER_TABLE_NAME
            + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ORDER_DATE + " TEXT ) ";

    protected final static String DROP_ORDER_TABLE = "DROP TABLE IF EXISTS " + ORDER_TABLE_NAME + " ";
    public final static String SELECT_ORDER_TABLE = "SELECT * FROM " + ORDER_TABLE_NAME;


    //=======================| OrderDetails Model |=======================
    public final static String ORDER_DETAIL_TABLE_NAME = "order_detail_table";
    public final static String ORDER_ID = "order_id";
    public final static String PRODUCT_ID = "product_id";
    public final static String PRODUCT_AMOUNT = "amount";

    protected final static String CREATE_ORDER_DETAIL_TABLE = "CREATE TABLE " + ORDER_DETAIL_TABLE_NAME
            + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ORDER_ID + " TEXT, "
            + PRODUCT_ID + " TEXT, "
            + PRODUCT_AMOUNT + " TEXT ) ";

    protected final static String DROP_ORDER_DETAIL_TABLE = "DROP TABLE IF EXISTS " + ORDER_DETAIL_TABLE_NAME + " ";
    public final static String SELECT_ORDER_DETAIL_TABLE = "SELECT * FROM " + ORDER_DETAIL_TABLE_NAME;


    //=======================| Shippers Model |=======================
    public final static String SHIPPER_TABLE_NAME = "shipper_table";
    public final static String SHIPPER_NAME = "shipper_name";
    public final static String SHIPPER_PHONE_NUMBER = "shipper_phone_number";

    protected final static String CREATE_SHIPPER_TABLE = "CREATE TABLE " + SHIPPER_TABLE_NAME
            + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + SHIPPER_NAME + " TEXT, "
            + SHIPPER_PHONE_NUMBER + " TEXT ) ";

    protected final static String DROP_SHIPPER_TABLE = "DROP TABLE IF EXISTS " + SHIPPER_TABLE_NAME + " ";
    public final static String SELECT_SHIPPER_TABLE = "SELECT * FROM " + SHIPPER_TABLE_NAME;


    //=======================| Receipts Model |=======================
    public final static String RECEIPT_TABLE_NAME = "receipt_table";
    public final static String TYPE_OF_RECEIPT = "type_of_receipt";
    public final static String RECEIPT_AMOUNT = "receipt_amount";
    public final static String RECEIPT_DATE = "receipt_date";

    protected final static String CREATE_RECEIPT_TABLE = "CREATE TABLE " + RECEIPT_TABLE_NAME
            + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + TYPE_OF_RECEIPT + " TEXT, "
            + RECEIPT_AMOUNT + " TEXT, "
            + RECEIPT_DATE + " TEXT ) ";

    protected final static String DROP_RECEIPT_TABLE = "DROP TABLE IF EXISTS " + RECEIPT_TABLE_NAME + " ";
    public final static String SELECT_RECEIPT_TABLE = "SELECT * FROM " + RECEIPT_TABLE_NAME;


    //=======================| Expenses Model |=======================
    public final static String EXPENSE_TABLE_NAME = "expense_table";
    public final static String TYPE_OF_EXPENSE = "type_of_expense";
    public final static String EXPENSE_AMOUNT = "expense_amount";
    public final static String EXPENSE_DATE = "expense_date";

    protected final static String CREATE_EXPENSE_TABLE = "CREATE TABLE " + EXPENSE_TABLE_NAME
            + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + TYPE_OF_EXPENSE + " TEXT, "
            + EXPENSE_AMOUNT + " TEXT, "
            + EXPENSE_DATE + " TEXT ) ";

    protected final static String DROP_EXPENSE_TABLE = "DROP TABLE IF EXISTS " + EXPENSE_TABLE_NAME + " ";
    public final static String SELECT_EXPENSE_TABLE = "SELECT * FROM " + EXPENSE_TABLE_NAME;
}
