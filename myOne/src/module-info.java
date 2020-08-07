import A3.MyService;
import A3.impl.Czxy;
import A3.impl.Itheima;

module myOne {
    exports A1;
    exports A2;
    exports A3;
    provides MyService with Czxy;
}