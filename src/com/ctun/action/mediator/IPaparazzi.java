package com.ctun.action.mediator;


public abstract class IPaparazzi {
    
    public IPaparazzi(IDetectiveCompany detectiveCompany) {
        
        this.detectiveCompany = detectiveCompany;
        
    }


    private IDetectiveCompany detectiveCompany;
    
    /**
     * 拍照片
     * @Description (TODO这里用一句话描述这个方法的作用)
     */
    public abstract void takePhoto();

    
    public IDetectiveCompany getDetectiveCompany() {
        return detectiveCompany;
    }

    
    public void setDetectiveCompany(IDetectiveCompany detectiveCompany) {
        this.detectiveCompany = detectiveCompany;
    }

}
