package d.l.e.i.h.s.com.diyweather.db;

import android.webkit.DateSorter;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/4.
 */

public class province extends DataSupport{
    private int id ;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id ;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
        public void setProvinceCode(int provinceCode){
            this.provinceCode=provinceCode;
        }
    }

