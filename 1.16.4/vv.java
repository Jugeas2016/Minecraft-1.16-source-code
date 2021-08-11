/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.util.Collection;
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
/*    */ 
/*    */ public class vv
/*    */   extends acj
/*    */ {
/* 27 */   private static final Logger a = LogManager.getLogger();
/* 28 */   private static final Gson b = (new GsonBuilder()).create();
/*    */   
/* 30 */   private z c = new z();
/*    */   private final cza d;
/*    */   
/*    */   public vv(cza ☃) {
/* 34 */     super(b, "advancements");
/* 35 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(Map<vk, JsonElement> ☃, ach ach1, anw anw1) {
/* 40 */     Map<vk, y.a> map = Maps.newHashMap();
/*    */     
/* 42 */     ☃.forEach((vk1, jsonElement) -> {
/*    */           try {
/*    */             JsonObject jsonObject = afd.m(jsonElement, "advancement");
/*    */             y.a a = y.a.a(jsonObject, new ax(vk1, this.d));
/*    */             ☃.put(vk1, a);
/* 47 */           } catch (JsonParseException|IllegalArgumentException runtimeException) {
/*    */             a.error("Parsing error loading custom advancement {}: {}", vk1, runtimeException.getMessage());
/*    */           } 
/*    */         });
/*    */     
/* 52 */     z z1 = new z();
/* 53 */     z1.a(map);
/*    */     
/* 55 */     for (y y : z1.b()) {
/* 56 */       if (y.c() != null) {
/* 57 */         ak.a(y);
/*    */       }
/*    */     } 
/*    */     
/* 61 */     this.c = z1;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public y a(vk ☃) {
/* 66 */     return this.c.a(☃);
/*    */   }
/*    */   
/*    */   public Collection<y> a() {
/* 70 */     return this.c.c();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */