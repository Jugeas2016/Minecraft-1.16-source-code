/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import java.util.stream.Stream;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class bsn
/*    */ {
/*    */   private final bry a;
/*    */   private final chw b;
/*    */   
/*    */   public bsn(bry ☃, chw chw1) {
/* 23 */     this.a = ☃;
/* 24 */     this.b = chw1;
/*    */   }
/*    */ 
/*    */   
/*    */   public bsn a(aam ☃) {
/* 29 */     if (☃.E() != this.a) {
/* 30 */       throw new IllegalStateException("Using invalid feature manager (source level: " + ☃.E() + ", region: " + ☃);
/*    */     }
/* 32 */     return new bsn(☃, this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<? extends crv<?>> a(gp ☃, cla<?> cla1) {
/* 37 */     return this.a.a(☃.a(), ☃.c(), cga.c).b(cla1)
/* 38 */       .stream()
/* 39 */       .map(☃ -> gp.a(new brd(☃.longValue()), 0))
/* 40 */       .map(gp1 -> a(gp1, ☃, this.a.a(gp1.a(), gp1.c(), cga.b)))
/* 41 */       .filter(☃ -> (☃ != null && ☃.e()));
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public crv<?> a(gp ☃, cla<?> cla1, cgd cgd1) {
/* 46 */     return cgd1.a(cla1);
/*    */   }
/*    */   
/*    */   public void a(gp ☃, cla<?> cla1, crv<?> crv1, cgd cgd1) {
/* 50 */     cgd1.a(cla1, crv1);
/*    */   }
/*    */   
/*    */   public void a(gp ☃, cla<?> cla1, long l, cgd cgd1) {
/* 54 */     cgd1.a(cla1, l);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 58 */     return this.b.b();
/*    */   }
/*    */   
/*    */   public crv<?> a(fx ☃, boolean bool, cla<?> cla1) {
/* 62 */     return (crv)DataFixUtils.orElse(a(gp.a(☃), cla1)
/* 63 */         .filter(crv1 -> crv1.c().b(☃))
/* 64 */         .filter(crv1 -> (!☃ || crv1.d().stream().anyMatch(())))
/* 65 */         .findFirst(), crv.a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */