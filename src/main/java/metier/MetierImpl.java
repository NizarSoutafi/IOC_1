package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*200/Math.sin(tmp*Math.max(10,20));

        return res;

    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
