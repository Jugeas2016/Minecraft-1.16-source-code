/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cya
/*    */ {
/*    */   static class a
/*    */     extends cxs
/*    */   {
/* 14 */     private final Map<String, md> a = Maps.newHashMap();
/*    */     
/*    */     public a(String ☃) {
/* 17 */       super(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(md ☃) {
/* 22 */       md md1 = ☃.p("contents");
/* 23 */       for (String str : md1.d()) {
/* 24 */         this.a.put(str, md1.p(str));
/*    */       }
/*    */     }
/*    */ 
/*    */     
/*    */     public md b(md ☃) {
/* 30 */       md md1 = new md();
/* 31 */       this.a.forEach((str, md1) -> ☃.a(str, md1.g()));
/* 32 */       ☃.a("contents", md1);
/* 33 */       return ☃;
/*    */     }
/*    */     
/*    */     public md a(String ☃) {
/* 37 */       md md = this.a.get(☃);
/* 38 */       return (md != null) ? md : new md();
/*    */     }
/*    */     
/*    */     public void a(String ☃, md md1) {
/* 42 */       if (md1.isEmpty()) {
/* 43 */         this.a.remove(☃);
/*    */       } else {
/* 45 */         this.a.put(☃, md1);
/*    */       } 
/* 47 */       b();
/*    */     }
/*    */     
/*    */     public Stream<vk> b(String ☃) {
/* 51 */       return this.a.keySet().stream().map(str1 -> new vk(☃, str1));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/* 56 */   private final Map<String, a> a = Maps.newHashMap();
/*    */   private final cyc b;
/*    */   
/*    */   public cya(cyc ☃) {
/* 60 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   private a a(String ☃, String str1) {
/* 64 */     a a = new a(str1);
/* 65 */     this.a.put(☃, a);
/* 66 */     return a;
/*    */   }
/*    */   
/*    */   public md a(vk ☃) {
/* 70 */     String str1 = ☃.b();
/* 71 */     String str2 = a(str1);
/* 72 */     a a = this.b.<a>b(() -> a(☃, str1), str2);
/* 73 */     return (a != null) ? a.a(☃.a()) : new md();
/*    */   }
/*    */   
/*    */   public void a(vk ☃, md md1) {
/* 77 */     String str1 = ☃.b();
/* 78 */     String str2 = a(str1);
/* 79 */     ((a)this.b.<a>a(() -> a(☃, str1), str2)).a(☃.a(), md1);
/*    */   }
/*    */   
/*    */   public Stream<vk> a() {
/* 83 */     return this.a.entrySet().stream().flatMap(☃ -> ((a)☃.getValue()).b((String)☃.getKey()));
/*    */   }
/*    */   
/*    */   private static String a(String ☃) {
/* 87 */     return "command_storage_" + ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cya.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */