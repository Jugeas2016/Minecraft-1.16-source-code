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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aua
/*    */   extends arv<aqu>
/*    */ {
/*    */   private final ayd<gf> b;
/*    */   private long c;
/*    */   private final int d;
/*    */   private float e;
/*    */   
/*    */   public aua(ayd<gf> ☃, float f, int i) {
/* 30 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.c, ☃, aye.a));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 35 */     this.b = ☃;
/* 36 */     this.e = f;
/* 37 */     this.d = i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqu aqu1) {
/* 42 */     Optional<gf> optional = aqu1.cJ().c(this.b);
/* 43 */     return (optional.isPresent() && ☃
/* 44 */       .Y() == ((gf)optional.get()).a() && ((gf)optional
/* 45 */       .get()).b().a(aqu1.cA(), this.d));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqu aqu1, long l) {
/* 50 */     if (l > this.c) {
/* 51 */       Optional<dcn> optional = Optional.ofNullable(azj.b(aqu1, 8, 6));
/* 52 */       aqu1.cJ().a(ayd.m, optional.map(☃ -> new ayf(☃, this.e, 1)));
/* 53 */       this.c = l + 180L;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aua.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */