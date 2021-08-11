/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ckb
/*    */   extends cla<cme>
/*    */ {
/*    */   public ckb(Codec<cme> ☃) {
/* 24 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(cfy ☃, bsy bsy1, long l, chx chx1, int i, int j, bsv bsv1, brd brd1, cme cme1) {
/* 29 */     chx1.c(l, i, j);
/*    */     
/* 31 */     double d = cme1.b;
/* 32 */     return (chx1.nextDouble() < d);
/*    */   }
/*    */ 
/*    */   
/*    */   public cla.a<cme> a() {
/* 37 */     return a::new;
/*    */   }
/*    */   
/*    */   public enum b implements afs {
/* 41 */     a("normal"),
/* 42 */     b("mesa");
/*    */ 
/*    */     
/* 45 */     public static final Codec<b> c = afs.a(b::values, b::a); private static final Map<String, b> d; static {
/* 46 */       d = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(b::b, ☃ -> ☃));
/*    */     }
/*    */     private final String e;
/*    */     b(String ☃) {
/* 50 */       this.e = ☃;
/*    */     }
/*    */     
/*    */     public String b() {
/* 54 */       return this.e;
/*    */     }
/*    */     
/*    */     private static b a(String ☃) {
/* 58 */       return d.get(☃);
/*    */     }
/*    */     
/*    */     public static b a(int ☃) {
/* 62 */       if (☃ < 0 || ☃ >= (values()).length) {
/* 63 */         return a;
/*    */       }
/* 65 */       return values()[☃];
/*    */     }
/*    */ 
/*    */     
/*    */     public String a() {
/* 70 */       return this.e;
/*    */     }
/*    */   }
/*    */   
/*    */   public static class a extends crv<cme> {
/*    */     public a(cla<cme> ☃, int i, int j, cra cra1, int k, long l) {
/* 76 */       super(☃, i, j, cra1, k, l);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cme cme1) {
/* 81 */       crh.d d = new crh.d(0, this.d, (i << 4) + 2, (j << 4) + 2, cme1.c);
/* 82 */       this.b.add(d);
/* 83 */       d.a(d, this.b, this.d);
/*    */       
/* 85 */       b();
/* 86 */       if (cme1.c == ckb.b.b) {
/*    */         
/* 88 */         int k = -5;
/* 89 */         int m = cfy1.f() - this.c.e + this.c.e() / 2 - -5;
/*    */ 
/*    */         
/* 92 */         this.c.a(0, m, 0);
/* 93 */         for (cru cru : this.b) {
/* 94 */           cru.a(0, m, 0);
/*    */         }
/*    */       } else {
/* 97 */         a(cfy1.f(), this.d, 10);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */