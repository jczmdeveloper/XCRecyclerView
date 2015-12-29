# XCRecyclerView
A RecyclerView that implements header and footer features，and you can use it like the standard RecyclerView, and,you no need another adapter.。
一个可以添加header和footer的RecyclerView，无需使用新的adapter，使用起来和标准的RecyclerView一样。


使用方法示例如下：

private MyAdapter mAdapter;

    private XCRecyclerView mRecyclerView;
    private List<String> mData;
    private View mHeaderView;
    private View mFooterView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mData = new  ArrayList<String>();
        for(int i = 0; i < 10 ;i++){
            mData.add("item_" + i);
        }
        mAdapter = new MyAdapter(mData);
        mRecyclerView = (XCRecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mHeaderView = LayoutInflater.from(this).inflate(R.layout.layout_header,mRecyclerView,false);
        mFooterView = LayoutInflater.from(this).inflate(R.layout.layout_footer,mRecyclerView,false);
        mRecyclerView.addHeaderView(mHeaderView);
        mRecyclerView.addFooterView(mFooterView);
        mRecyclerView.setAdapter(mAdapter);
    }

