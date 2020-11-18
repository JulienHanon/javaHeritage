
public abstract class Forme {
    public abstract float aire();
}

public class Carre extends Forme {
    private float cote;
    @Override
    public float aire(){
        return cote * cote;
    }
}

public class Cercle extends Forme {
    private float rayon;
    @Override
    public float aire() {
        return (float) 3.14159265358979323846264338327950288419716939937510582097494459230781640682862089986280348253421170679 * rayon * rayon;
    }
    }
}