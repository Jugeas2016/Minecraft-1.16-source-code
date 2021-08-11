/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dop
/*    */   extends dot
/*    */ {
/*    */   private final nu a;
/*    */   private final ImmutableList<a> b;
/* 21 */   private dlu c = dlu.a;
/*    */   private int p;
/*    */   private int q;
/*    */   
/*    */   protected dop(nr ☃, List<nu> list, ImmutableList<a> immutableList) {
/* 26 */     super(☃);
/* 27 */     this.a = nu.a(list);
/* 28 */     this.b = immutableList;
/*    */   }
/*    */ 
/*    */   
/*    */   public String ax_() {
/* 33 */     return super.ax_() + ". " + this.a.getString();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(djz ☃, int i, int j) {
/* 38 */     super.b(☃, i, j);
/*    */     
/* 40 */     for (UnmodifiableIterator<a> unmodifiableIterator1 = this.b.iterator(); unmodifiableIterator1.hasNext(); ) { a a = unmodifiableIterator1.next();
/* 41 */       this.q = Math.max(this.q, 20 + this.o.a(a.a(a)) + 20); }
/*    */     
/* 43 */     int k = 5 + this.q + 5;
/*    */     
/* 45 */     int m = k * this.b.size();
/* 46 */     this.c = dlu.a(this.o, this.a, m);
/*    */     
/* 48 */     this.o.getClass(); int n = this.c.a() * 9;
/* 49 */     this.p = (int)(j / 2.0D - n / 2.0D);
/*    */     
/* 51 */     this.o.getClass(); int i1 = this.p + n + 9 * 2;
/*    */     
/* 53 */     int i2 = (int)(i / 2.0D - m / 2.0D);
/* 54 */     for (UnmodifiableIterator<a> unmodifiableIterator2 = this.b.iterator(); unmodifiableIterator2.hasNext(); ) { a a = unmodifiableIterator2.next();
/* 55 */       a(new dlj(i2, i1, this.q, 20, a.a(a), a.b(a)));
/* 56 */       i2 += k; }
/*    */   
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 62 */     e(0);
/* 63 */     this.o.getClass(); a(☃, this.o, this.d, this.k / 2, this.p - 9 * 2, -1);
/* 64 */     this.c.a(☃, this.k / 2, this.p);
/* 65 */     super.a(☃, i, j, f);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean as_() {
/* 70 */     return false;
/*    */   }
/*    */   
/*    */   public static final class a {
/*    */     private final nr a;
/*    */     private final dlj.a b;
/*    */     
/*    */     public a(nr ☃, dlj.a a1) {
/* 78 */       this.a = ☃;
/* 79 */       this.b = a1;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */