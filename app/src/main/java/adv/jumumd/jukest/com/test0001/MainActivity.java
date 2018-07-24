package adv.jumumd.jukest.com.test0001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codbking.widget.DatePickDialog;
import com.codbking.widget.OnSureLisener;
import com.codbking.widget.bean.DateType;
import com.codbking.widget.view.WheelView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTime();

    }
    public void showTime(){
        DatePickDialog dialog = new DatePickDialog(this);
        //设置上下年分限制
        dialog.setYearLimt(5);
        //设置标题
        dialog.setTitle("选择时间");

        dialog.setLimitDate(true);
        //设置类型
        dialog.setType(DateType.TYPE_HM);
        //设置消息体的显示格式，日期格式
        dialog.setMessageFormat("HH:mm");
        //设置选择回调
        dialog.setOnChangeLisener(null);
        //设置点击确定按钮回调
        dialog.setOnSureLisener(null);
        dialog.show();
    }
}
