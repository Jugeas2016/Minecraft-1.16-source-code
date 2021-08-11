/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cer
/*    */   implements Predicate<ceh>
/*    */ {
/*    */   public static final Predicate<ceh> a = ☃ -> true;
/*    */   private final cei<buo, ceh> b;
/* 17 */   private final Map<cfj<?>, Predicate<Object>> c = Maps.newHashMap();
/*    */   
/*    */   private cer(cei<buo, ceh> ☃) {
/* 20 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public static cer a(buo ☃) {
/* 24 */     return new cer(☃.m());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(@Nullable ceh ☃) {
/* 33 */     if (☃ == null || !☃.b().equals(this.b.c())) {
/* 34 */       return false;
/*    */     }
/*    */     
/* 37 */     if (this.c.isEmpty()) {
/* 38 */       return true;
/*    */     }
/*    */     
/* 41 */     for (Map.Entry<cfj<?>, Predicate<Object>> entry : this.c.entrySet()) {
/* 42 */       if (!a(☃, (cfj<Comparable>)entry.getKey(), entry.getValue())) {
/* 43 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 47 */     return true;
/*    */   }
/*    */   
/*    */   protected <T extends Comparable<T>> boolean a(ceh ☃, cfj<T> cfj1, Predicate<Object> predicate) {
/* 51 */     T t = (T)☃.c(cfj1);
/* 52 */     return predicate.test(t);
/*    */   }
/*    */   
/*    */   public <V extends Comparable<V>> cer a(cfj<V> ☃, Predicate<Object> predicate) {
/* 56 */     if (!this.b.d().contains(☃)) {
/* 57 */       throw new IllegalArgumentException(this.b + " cannot support property " + ☃);
/*    */     }
/* 59 */     this.c.put(☃, predicate);
/* 60 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */