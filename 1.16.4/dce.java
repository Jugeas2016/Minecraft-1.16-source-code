/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dce<C>
/*    */ {
/* 15 */   private static final Logger b = LogManager.getLogger();
/*    */   
/* 17 */   public static final dce<MinecraftServer> a = (new dce())
/* 18 */     .a(new dcb.a())
/* 19 */     .a(new dcc.a());
/*    */   
/* 21 */   private final Map<vk, dcd.a<C, ?>> c = Maps.newHashMap();
/*    */   
/* 23 */   private final Map<Class<?>, dcd.a<C, ?>> d = Maps.newHashMap();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public dce<C> a(dcd.a<C, ?> ☃) {
/* 30 */     this.c.put(☃.a(), ☃);
/* 31 */     this.d.put(☃.b(), ☃);
/* 32 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   private <T extends dcd<C>> dcd.a<C, T> a(Class<?> ☃) {
/* 37 */     return (dcd.a<C, T>)this.d.get(☃);
/*    */   }
/*    */   
/*    */   public <T extends dcd<C>> md a(T ☃) {
/* 41 */     dcd.a<C, T> a = a(☃.getClass());
/* 42 */     md md = new md();
/* 43 */     a.a(md, ☃);
/* 44 */     md.a("Type", a.a().toString());
/* 45 */     return md;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public dcd<C> a(md ☃) {
/* 50 */     vk vk = vk.a(☃.l("Type"));
/* 51 */     dcd.a<C, ?> a = this.c.get(vk);
/* 52 */     if (a == null) {
/* 53 */       b.error("Failed to deserialize timer callback: " + ☃);
/* 54 */       return null;
/*    */     } 
/*    */     try {
/* 57 */       return (dcd<C>)a.b(☃);
/* 58 */     } catch (Exception exception) {
/* 59 */       b.error("Failed to deserialize timer callback: " + ☃, exception);
/* 60 */       return null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */