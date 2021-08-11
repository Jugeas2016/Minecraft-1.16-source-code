/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aub
/*    */   extends arv<aqu>
/*    */ {
/*    */   private final ayd<gf> b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   private final float e;
/*    */   private long f;
/*    */   
/*    */   public aub(ayd<gf> ☃, float f, int i, int j) {
/* 23 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.c, ☃, aye.a));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 28 */     this.b = ☃;
/* 29 */     this.e = f;
/* 30 */     this.c = i;
/* 31 */     this.d = j;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqu aqu1) {
/* 36 */     Optional<gf> optional = aqu1.cJ().c(this.b);
/* 37 */     return (optional.isPresent() && ☃.Y() == ((gf)optional.get()).a() && ((gf)optional.get()).b().a(aqu1.cA(), this.d));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqu aqu1, long l) {
/* 42 */     if (l > this.f) {
/* 43 */       arf<?> arf = aqu1.cJ();
/* 44 */       Optional<gf> optional = arf.c(this.b);
/* 45 */       optional.ifPresent(gf1 -> ☃.a(ayd.m, new ayf(gf1.b(), this.e, this.c)));
/* 46 */       this.f = l + 80L;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */