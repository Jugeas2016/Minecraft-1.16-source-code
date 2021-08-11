/*    */ import java.util.IdentityHashMap;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adz<T>
/*    */   implements Iterable<adx<T>>
/*    */ {
/*    */   private final gm<T> a;
/* 14 */   private final Map<T, adx<T>> b = new IdentityHashMap<>();
/*    */   @Nullable
/*    */   private nr c;
/*    */   
/*    */   public adz(gm<T> ☃) {
/* 19 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public boolean a(T ☃) {
/* 23 */     return this.b.containsKey(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public adx<T> a(T ☃, ady ady1) {
/* 28 */     return this.b.computeIfAbsent(☃, object -> new adx<>(this, (T)object, ☃));
/*    */   }
/*    */   
/*    */   public gm<T> a() {
/* 32 */     return this.a;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Iterator<adx<T>> iterator() {
/* 41 */     return this.b.values().iterator();
/*    */   }
/*    */   
/*    */   public adx<T> b(T ☃) {
/* 45 */     return a(☃, ady.b);
/*    */   }
/*    */   
/*    */   public String c() {
/* 49 */     return "stat_type." + gm.ag.b(this).toString().replace(':', '.');
/*    */   }
/*    */   
/*    */   public nr d() {
/* 53 */     if (this.c == null) {
/* 54 */       this.c = new of(c());
/*    */     }
/* 56 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */