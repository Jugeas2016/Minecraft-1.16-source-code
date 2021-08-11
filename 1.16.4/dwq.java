/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
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
/*    */ public class dwq
/*    */ {
/* 19 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final djz b;
/* 22 */   private final z c = new z();
/* 23 */   private final Map<y, aa> d = Maps.newHashMap();
/*    */   @Nullable
/*    */   private a e;
/*    */   @Nullable
/*    */   private y f;
/*    */   
/*    */   public dwq(djz ☃) {
/* 30 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public void a(rt ☃) {
/* 34 */     if (☃.e()) {
/* 35 */       this.c.a();
/* 36 */       this.d.clear();
/*    */     } 
/*    */     
/* 39 */     this.c.a(☃.c());
/* 40 */     this.c.a(☃.b());
/* 41 */     for (Map.Entry<vk, aa> entry : ☃.d().entrySet()) {
/* 42 */       y y1 = this.c.a(entry.getKey());
/* 43 */       if (y1 != null) {
/* 44 */         aa aa = entry.getValue();
/* 45 */         aa.a(y1.f(), y1.i());
/* 46 */         this.d.put(y1, aa);
/* 47 */         if (this.e != null) {
/* 48 */           this.e.a(y1, aa);
/*    */         }
/* 50 */         if (!☃.e() && aa.a() && y1.c() != null && y1.c().h())
/* 51 */           this.b.an().a(new dmn(y1)); 
/*    */         continue;
/*    */       } 
/* 54 */       a.warn("Server informed client about progress for unknown advancement {}", entry.getKey());
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public z a() {
/* 60 */     return this.c;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(@Nullable y ☃, boolean bool) {
/* 68 */     dwu dwu = this.b.w();
/* 69 */     if (dwu != null && ☃ != null && bool) {
/* 70 */       dwu.a(tg.a(☃));
/*    */     }
/* 72 */     if (this.f != ☃) {
/* 73 */       this.f = ☃;
/* 74 */       if (this.e != null) {
/* 75 */         this.e.e(☃);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(@Nullable a ☃) {
/* 81 */     this.e = ☃;
/* 82 */     this.c.a(☃);
/* 83 */     if (☃ != null) {
/* 84 */       for (Map.Entry<y, aa> entry : this.d.entrySet()) {
/* 85 */         ☃.a(entry.getKey(), entry.getValue());
/*    */       }
/* 87 */       ☃.e(this.f);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static interface a extends z.a {
/*    */     void a(y param1y, aa param1aa);
/*    */     
/*    */     void e(@Nullable y param1y);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */