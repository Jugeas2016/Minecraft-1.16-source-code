/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.function.Predicate;
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
/*    */ public class atl
/*    */   extends arv<aqm>
/*    */ {
/*    */   private final Predicate<aqm> b;
/*    */   private final float c;
/*    */   
/*    */   public atl(aqo ☃, float f) {
/* 28 */     this(aqm1 -> ☃.equals(aqm1.X().e()), f);
/*    */   }
/*    */   
/*    */   public atl(aqe<?> ☃, float f) {
/* 32 */     this(aqm1 -> ☃.equals(aqm1.X()), f);
/*    */   }
/*    */   
/*    */   public atl(float ☃) {
/* 36 */     this(☃ -> true, ☃);
/*    */   }
/*    */   
/*    */   public atl(Predicate<aqm> ☃, float f) {
/* 40 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.n, aye.b, ayd.h, aye.a));
/*    */ 
/*    */ 
/*    */     
/* 44 */     this.b = ☃;
/* 45 */     this.c = f * f;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqm aqm1) {
/* 50 */     return ((List<aqm>)aqm1.cJ().<List<aqm>>c(ayd.h).get()).stream()
/* 51 */       .anyMatch(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1, long l) {
/* 56 */     arf<?> arf = aqm1.cJ();
/* 57 */     arf.<List<aqm>>c(ayd.h).ifPresent(list -> list.stream().filter(this.b).filter(()).findFirst().ifPresent(()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */