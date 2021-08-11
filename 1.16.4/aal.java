/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aal<T>
/*    */ {
/*    */   private final String i;
/*    */   private final Comparator<T> j;
/*    */   private final long k;
/* 15 */   public static final aal<afx> a = a("start", (☃, afx1) -> 0);
/* 16 */   public static final aal<afx> b = a("dragon", (☃, afx1) -> 0);
/* 17 */   public static final aal<brd> c = a("player", Comparator.comparingLong(brd::a));
/* 18 */   public static final aal<brd> d = a("forced", Comparator.comparingLong(brd::a));
/* 19 */   public static final aal<brd> e = a("light", Comparator.comparingLong(brd::a));
/* 20 */   public static final aal<fx> f = a("portal", gr::i, 300);
/* 21 */   public static final aal<Integer> g = a("post_teleport", Integer::compareTo, 5);
/* 22 */   public static final aal<brd> h = a("unknown", Comparator.comparingLong(brd::a), 1);
/*    */   
/*    */   public static <T> aal<T> a(String ☃, Comparator<T> comparator) {
/* 25 */     return new aal<>(☃, comparator, 0L);
/*    */   }
/*    */   
/*    */   public static <T> aal<T> a(String ☃, Comparator<T> comparator, int i) {
/* 29 */     return new aal<>(☃, comparator, i);
/*    */   }
/*    */   
/*    */   protected aal(String ☃, Comparator<T> comparator, long l) {
/* 33 */     this.i = ☃;
/* 34 */     this.j = comparator;
/* 35 */     this.k = l;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 40 */     return this.i;
/*    */   }
/*    */   
/*    */   public Comparator<T> a() {
/* 44 */     return this.j;
/*    */   }
/*    */   
/*    */   public long b() {
/* 48 */     return this.k;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */