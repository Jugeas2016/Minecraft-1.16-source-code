/*    */ import com.google.common.base.Charsets;
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.channels.FileChannel;
/*    */ import java.nio.channels.FileLock;
/*    */ import java.nio.file.AccessDeniedException;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.NoSuchFileException;
/*    */ import java.nio.file.OpenOption;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.StandardOpenOption;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aex
/*    */   implements AutoCloseable
/*    */ {
/*    */   private final FileChannel a;
/*    */   private final FileLock b;
/*    */   private static final ByteBuffer c;
/*    */   
/*    */   static {
/* 24 */     byte[] ☃ = "☃".getBytes(Charsets.UTF_8);
/* 25 */     c = ByteBuffer.allocateDirect(☃.length);
/* 26 */     c.put(☃);
/* 27 */     c.flip();
/*    */   }
/*    */   
/*    */   public static aex a(Path ☃) throws IOException {
/* 31 */     Path path = ☃.resolve("session.lock");
/*    */ 
/*    */     
/* 34 */     if (!Files.isDirectory(☃, new java.nio.file.LinkOption[0])) {
/* 35 */       Files.createDirectories(☃, (FileAttribute<?>[])new FileAttribute[0]);
/*    */     }
/* 37 */     FileChannel fileChannel = FileChannel.open(path, new OpenOption[] { StandardOpenOption.CREATE, StandardOpenOption.WRITE });
/*    */     
/*    */     try {
/* 40 */       fileChannel.write(c.duplicate());
/* 41 */       fileChannel.force(true);
/* 42 */       FileLock fileLock = fileChannel.tryLock();
/* 43 */       if (fileLock == null) {
/* 44 */         throw a.a(path);
/*    */       }
/* 46 */       return new aex(fileChannel, fileLock);
/* 47 */     } catch (IOException iOException) {
/*    */       try {
/* 49 */         fileChannel.close();
/* 50 */       } catch (IOException iOException1) {
/* 51 */         iOException.addSuppressed(iOException1);
/*    */       } 
/* 53 */       throw iOException;
/*    */     } 
/*    */   }
/*    */   
/*    */   private aex(FileChannel ☃, FileLock fileLock) {
/* 58 */     this.a = ☃;
/* 59 */     this.b = fileLock;
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() throws IOException {
/*    */     try {
/* 65 */       if (this.b.isValid()) {
/* 66 */         this.b.release();
/*    */       }
/*    */     } finally {
/* 69 */       if (this.a.isOpen()) {
/* 70 */         this.a.close();
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 76 */     return this.b.isValid();
/*    */   }
/*    */   
/*    */   public static boolean b(Path ☃) throws IOException {
/* 80 */     Path path = ☃.resolve("session.lock");
/*    */     
/* 82 */     try(FileChannel ☃ = FileChannel.open(path, new OpenOption[] { StandardOpenOption.WRITE
/* 83 */           }); FileLock ☃ = fileChannel.tryLock()) {
/* 84 */       return (fileLock == null);
/* 85 */     } catch (AccessDeniedException accessDeniedException) {
/* 86 */       return true;
/* 87 */     } catch (NoSuchFileException noSuchFileException) {
/* 88 */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static class a extends IOException {
/*    */     private a(Path ☃, String str) {
/* 94 */       super(☃.toAbsolutePath() + ": " + str);
/*    */     }
/*    */     
/*    */     public static a a(Path ☃) {
/* 98 */       return new a(☃, "already locked (possibly by other Minecraft instance?)");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */