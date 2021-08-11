/*    */ import java.util.function.BiPredicate;
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
/*    */ public class bwc
/*    */ {
/*    */   public enum a
/*    */   {
/* 16 */     a,
/* 17 */     b,
/* 18 */     c;
/*    */   }
/*    */ 
/*    */   
/*    */   public static <S extends ccj> c<S> a(cck<S> ☃, Function<ceh, a> function, Function<ceh, gc> function1, cfb cfb1, ceh ceh1, bry bry1, fx fx1, BiPredicate<bry, fx> biPredicate) {
/* 23 */     S s = ☃.a(bry1, fx1);
/* 24 */     if (s == null) {
/* 25 */       return b::b;
/*    */     }
/*    */     
/* 28 */     if (biPredicate.test(bry1, fx1)) {
/* 29 */       return b::b;
/*    */     }
/*    */     
/* 32 */     a a = function.apply(ceh1);
/*    */     
/* 34 */     boolean bool1 = (a == a.a);
/* 35 */     boolean bool2 = (a == a.b);
/*    */     
/* 37 */     if (bool1) {
/* 38 */       return new c.b<>(s);
/*    */     }
/*    */     
/* 41 */     fx fx2 = fx1.a(function1.apply(ceh1));
/* 42 */     ceh ceh2 = bry1.d_(fx2);
/* 43 */     if (ceh2.a(ceh1.b())) {
/* 44 */       a a1 = function.apply(ceh2);
/* 45 */       if (a1 != a.a && a != a1 && ceh2.c(cfb1) == ceh1.c(cfb1)) {
/* 46 */         if (biPredicate.test(bry1, fx2)) {
/* 47 */           return b::b;
/*    */         }
/*    */         
/* 50 */         S s1 = ☃.a(bry1, fx2);
/* 51 */         if (s1 != null) {
/* 52 */           S s2 = bool2 ? s : s1;
/* 53 */           S s3 = bool2 ? s1 : s;
/* 54 */           return new c.a<>(s2, s3);
/*    */         } 
/*    */       } 
/*    */     } 
/* 58 */     return new c.b<>(s);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final class a<S>
/*    */     implements c<S>
/*    */   {
/*    */     private final S a;
/*    */ 
/*    */ 
/*    */     
/*    */     private final S b;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public a(S ☃, S s1) {
/* 77 */       this.a = ☃;
/* 78 */       this.b = s1;
/*    */     }
/*    */     
/*    */     public <T> T apply(bwc.b<? super S, T> ☃)
/*    */     {
/* 83 */       return ☃.a(this.a, this.b); } } public static interface c<S> { <T> T apply(bwc.b<? super S, T> param1b); public static final class a<S> implements c<S> { private final S a; public <T> T apply(bwc.b<? super S, T> ☃) { return ☃.a(this.a, this.b); }
/*    */        private final S b;
/*    */       public a(S ☃, S s1) {
/*    */         this.a = ☃;
/*    */         this.b = s1;
/*    */       } }
/*    */     public static final class b<S> implements c<S> { private final S a;
/*    */       public b(S ☃) {
/* 91 */         this.a = ☃;
/*    */       }
/*    */       
/*    */       public <T> T apply(bwc.b<? super S, T> ☃)
/*    */       {
/* 96 */         return ☃.a(this.a); } } } public static final class b<S> implements c<S> { private final S a; public b(S ☃) { this.a = ☃; } public <T> T apply(bwc.b<? super S, T> ☃) { return ☃.a(this.a); }
/*    */      }
/*    */ 
/*    */   
/*    */   public static interface b<S, T> {
/*    */     T a(S param1S1, S param1S2);
/*    */     
/*    */     T a(S param1S);
/*    */     
/*    */     T b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */