/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wd
/*    */ {
/* 14 */   private final Map<vk, wc> a = Maps.newHashMap();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public wc a(vk ☃) {
/* 21 */     return this.a.get(☃);
/*    */   }
/*    */   
/*    */   public wc a(vk ☃, nr nr1) {
/* 25 */     wc wc = new wc(☃, nr1);
/* 26 */     this.a.put(☃, wc);
/* 27 */     return wc;
/*    */   }
/*    */   
/*    */   public void a(wc ☃) {
/* 31 */     this.a.remove(☃.a());
/*    */   }
/*    */   
/*    */   public Collection<vk> a() {
/* 35 */     return this.a.keySet();
/*    */   }
/*    */   
/*    */   public Collection<wc> b() {
/* 39 */     return this.a.values();
/*    */   }
/*    */   
/*    */   public md c() {
/* 43 */     md ☃ = new md();
/*    */     
/* 45 */     for (wc wc : this.a.values()) {
/* 46 */       ☃.a(wc.a().toString(), wc.f());
/*    */     }
/*    */     
/* 49 */     return ☃;
/*    */   }
/*    */   
/*    */   public void a(md ☃) {
/* 53 */     for (String str : ☃.d()) {
/* 54 */       vk vk = new vk(str);
/* 55 */       this.a.put(vk, wc.a(☃.p(str), vk));
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(aah ☃) {
/* 60 */     for (wc wc : this.a.values()) {
/* 61 */       wc.c(☃);
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(aah ☃) {
/* 66 */     for (wc wc : this.a.values())
/* 67 */       wc.d(☃); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */