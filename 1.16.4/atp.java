/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
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
/*    */ public class atp<T>
/*    */   extends arv<aqu>
/*    */ {
/*    */   private final ayd<T> b;
/*    */   private final float c;
/*    */   private final int d;
/*    */   private final Function<T, dcn> e;
/*    */   
/*    */   public atp(ayd<T> ☃, float f, int i, boolean bool, Function<T, dcn> function) {
/* 23 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, bool ? aye.c : aye.b, ☃, aye.a));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 28 */     this.b = ☃;
/* 29 */     this.c = f;
/* 30 */     this.d = i;
/* 31 */     this.e = function;
/*    */   }
/*    */   
/*    */   public static atp<fx> a(ayd<fx> ☃, float f, int i, boolean bool) {
/* 35 */     return new atp<>(☃, f, i, bool, dcn::c);
/*    */   }
/*    */   
/*    */   public static atp<? extends aqa> b(ayd<? extends aqa> ☃, float f, int i, boolean bool) {
/* 39 */     return new atp<>(☃, f, i, bool, aqa::cA);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqu aqu1) {
/* 44 */     if (b(aqu1)) {
/* 45 */       return false;
/*    */     }
/* 47 */     return aqu1.cA().a(a(aqu1), this.d);
/*    */   }
/*    */   
/*    */   private dcn a(aqu ☃) {
/* 51 */     return this.e.apply(☃.cJ().<T>c(this.b).get());
/*    */   }
/*    */   
/*    */   private boolean b(aqu ☃) {
/* 55 */     if (!☃.cJ().a(ayd.m)) {
/* 56 */       return false;
/*    */     }
/*    */     
/* 59 */     ayf ayf = ☃.cJ().<ayf>c(ayd.m).get();
/* 60 */     if (ayf.b() != this.c) {
/* 61 */       return false;
/*    */     }
/*    */     
/* 64 */     dcn dcn1 = ayf.a().a().d(☃.cA());
/* 65 */     dcn dcn2 = a(☃).d(☃.cA());
/* 66 */     return (dcn1.b(dcn2) < 0.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqu aqu1, long l) {
/* 71 */     a(aqu1, a(aqu1), this.c);
/*    */   }
/*    */   
/*    */   private static void a(aqu ☃, dcn dcn1, float f) {
/* 75 */     for (int i = 0; i < 10; i++) {
/* 76 */       dcn dcn2 = azj.d(☃, 16, 7, dcn1);
/*    */       
/* 78 */       if (dcn2 != null) {
/* 79 */         ☃.cJ().a(ayd.m, new ayf(dcn2, f, 0));
/*    */         return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */