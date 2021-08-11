/*    */ import com.mojang.blaze3d.platform.GLX;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.Method;
/*    */ import javax.annotation.Nullable;
/*    */ import org.lwjgl.system.Pointer;
/*    */ 
/*    */ 
/*    */ public class dei
/*    */ {
/*    */   static {
/* 13 */     a = (MethodHandle)GLX.make(() -> {
/*    */           try {
/*    */             MethodHandles.Lookup ☃ = MethodHandles.lookup();
/*    */             
/*    */             Class<?> clazz = Class.forName("org.lwjgl.system.MemoryManage$DebugAllocator");
/*    */             
/*    */             Method method = clazz.getDeclaredMethod("untrack", new Class[] { long.class });
/*    */             
/*    */             method.setAccessible(true);
/*    */             
/*    */             Field field = Class.forName("org.lwjgl.system.MemoryUtil$LazyInit").getDeclaredField("ALLOCATOR");
/*    */             
/*    */             field.setAccessible(true);
/*    */             
/*    */             Object object = field.get(null);
/*    */             return clazz.isInstance(object) ? ☃.unreflect(method) : null;
/* 29 */           } catch (ClassNotFoundException|NoSuchMethodException|NoSuchFieldException|IllegalAccessException ☃) {
/*    */             throw new RuntimeException(☃);
/*    */           } 
/*    */         });
/*    */   } @Nullable
/*    */   private static final MethodHandle a; public static void a(long ☃) {
/* 35 */     if (a == null) {
/*    */       return;
/*    */     }
/*    */     try {
/* 39 */       a.invoke(☃);
/* 40 */     } catch (Throwable throwable) {
/* 41 */       throw new RuntimeException(throwable);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void a(Pointer ☃) {
/* 46 */     a(☃.address());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dei.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */