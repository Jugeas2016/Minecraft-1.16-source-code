/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
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
/*    */ public class eaw
/*    */ {
/* 17 */   private final Map<ceh, elo> a = Maps.newIdentityHashMap();
/*    */   private final elt b;
/*    */   
/*    */   public eaw(elt ☃) {
/* 21 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public ekc a(ceh ☃) {
/* 25 */     return b(☃).e();
/*    */   }
/*    */   
/*    */   public elo b(ceh ☃) {
/* 29 */     elo elo = this.a.get(☃);
/* 30 */     if (elo == null) {
/* 31 */       elo = this.b.a();
/*    */     }
/*    */     
/* 34 */     return elo;
/*    */   }
/*    */   
/*    */   public elt a() {
/* 38 */     return this.b;
/*    */   }
/*    */   
/*    */   public void b() {
/* 42 */     this.a.clear();
/*    */     
/* 44 */     for (Iterator<buo> iterator = gm.Q.iterator(); iterator.hasNext(); ) { buo ☃ = iterator.next();
/* 45 */       ☃.m().a().forEach(☃ -> (elo)this.a.put(☃, this.b.a(c(☃)))); }
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static elu c(ceh ☃) {
/* 52 */     return a(gm.Q.b(☃.b()), ☃);
/*    */   }
/*    */   
/*    */   public static elu a(vk ☃, ceh ceh1) {
/* 56 */     return new elu(☃, a((Map<cfj<?>, Comparable<?>>)ceh1.s()));
/*    */   }
/*    */   
/*    */   public static String a(Map<cfj<?>, Comparable<?>> ☃) {
/* 60 */     StringBuilder stringBuilder = new StringBuilder();
/* 61 */     for (Map.Entry<cfj<?>, Comparable<?>> entry : ☃.entrySet()) {
/* 62 */       if (stringBuilder.length() != 0) {
/* 63 */         stringBuilder.append(',');
/*    */       }
/*    */       
/* 66 */       cfj<?> cfj = entry.getKey();
/* 67 */       stringBuilder.append(cfj.f());
/* 68 */       stringBuilder.append('=');
/* 69 */       stringBuilder.append(a(cfj, entry.getValue()));
/*    */     } 
/*    */     
/* 72 */     return stringBuilder.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   private static <T extends Comparable<T>> String a(cfj<T> ☃, Comparable<?> comparable) {
/* 77 */     return ☃.a((T)comparable);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eaw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */