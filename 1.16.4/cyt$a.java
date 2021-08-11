/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.function.Function;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a<E, T extends czf<E>>
/*    */ {
/*    */   private final gm<T> a;
/*    */   private final String b;
/*    */   private final String c;
/*    */   private final Function<E, T> d;
/*    */   @Nullable
/*    */   private Pair<T, cyt.b<? extends E>> e;
/*    */   
/*    */   private a(gm<T> ☃, String str1, String str2, Function<E, T> function) {
/* 33 */     this.a = ☃;
/* 34 */     this.b = str1;
/* 35 */     this.c = str2;
/* 36 */     this.d = function;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object a() {
/* 45 */     return new cyt.c<>(this.a, this.b, this.c, this.d, this.e, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyt$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */